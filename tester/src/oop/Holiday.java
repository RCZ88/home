package oop;

public class Holiday {
	String name; 
	int day; 
	String month;
	
	Holiday(String name, int day, String month){
		this.name = name;
		this.day = day;
		this.month = month;
	}
	public boolean inSameMonth(Holiday h1, Holiday h2){
		if (h1.month == h2.month) {
			return true; 
		}else {
			return false;
		}
	}
	public static double avgDate(Holiday[] holidays) {
		int td = 0; 
		for(Holiday holiday : holidays) {
			td += holiday.day;
		}
		return (double) td/ holidays.length;
		
	}
}	
