package oop;

public class Holiday1 {
	private String name;
	private int day; 
	private String month;
	
	Holiday1(String name, int day, String month){
		this.name = name;
		this.day = day;
		this.month = month;
	}
	public static boolean inSameMonth(Holiday1 h1, Holiday1 h2) {
		if(h1.month.equals(h2)) {
			return true;
		}
		return false;
	}
	public int getDay() {
		return day;
	}
	public static double avgDate(Holiday1 dates[]) {
		int sum = 0;
		for(int i = 0; i<dates.length; i++) {
			sum+=dates[i].day;
		}
		int avgDate = sum/dates.length;
		return avgDate;
		
	}
}
