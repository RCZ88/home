package hotel;

import java.time.LocalDate;
import java.time.Period;

public class Dates {
	private int day;
	private int month;
	private int year;
	
	public Dates(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public static int StayDays(Dates x, Dates y) {
		LocalDate checkIn = LocalDate.of(x.getYear(), x.getMonth(), x.getDay());
		LocalDate checkOut = LocalDate.of(y.getYear(), y.getMonth(), y.getDay());
		Period period = Period.between(checkIn, checkOut);
		return period.getDays();
	}
}
