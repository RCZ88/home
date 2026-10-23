package oop;
import java.util.Scanner;
public class TestforHolidayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Holiday1 h1 = new Holiday1("Christmas", 25, "December");
		Holiday1 h2 = new Holiday1("Easter", 1, "March");
		Holiday1 h3 = new Holiday1("Independence Day", 4, "July");
		boolean sameMonth = Holiday1.inSameMonth(h1,h2);
		System.out.println(sameMonth);
		
		Holiday1 [] dates = new Holiday1 [3];
		dates[0] = h1;
		dates[1] = h2;
		dates[2] = h3;
		Double avgDates = Holiday1.avgDate(dates);
		System.out.println(avgDates);
		
	}

}
