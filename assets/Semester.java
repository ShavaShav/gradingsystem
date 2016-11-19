package assets;

import java.util.ArrayList;

public class Semester{
	private String season;
	private int year;
	
	public Semester(String season, int year) throws Exception{
		if (isValid(season, year)){
			this.season=season;
			this.year=year;
		} else
			throw new Exception("Semester not valid");
	}
	
	public void setSemester(String season, int year) throws Exception{
		if (isValid(season, year)){
			this.season=season;
			this.year=year;
		} else
			throw new Exception("Semester not valid");
	}
	
	private boolean isValid(String season, int year){
		switch (season){
			case "Fall": break;
			case "Winter": break;
			case "Spring": break;
			case "Summer": break;
			default: return false;
		}
		
		if (year < 1000 || year > 9999) // 4 digits only
			return false;
		
		return true;
	}
	
	public boolean before(Semester s){
		if (this.year < s.year)
			return true;
		else if(this.year > s.year)
			return false;
		else{	// same year, sort by season
			ArrayList<String> orderedSemesters = new ArrayList<String>();
			orderedSemesters.add("Winter");
			orderedSemesters.add("Spring");
			orderedSemesters.add("Summer");
			orderedSemesters.add("Fall");
			if (orderedSemesters.indexOf(this.season) < orderedSemesters.indexOf(s.season))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return season + " " + year;
	}
}
