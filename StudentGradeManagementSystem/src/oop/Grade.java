package oop;

public class Grade {
	private double courseGrade;
	private double weightedGrade;
	private static double totalGrade;
	private static double averageGrade;
	private static double grades;
	
	public Grade(double courseGrade) {
		this.courseGrade = courseGrade;
		totalGrade+=courseGrade;
		grades++;
	}
	
	public double calculateWeightedGrade(int credits) {
		return courseGrade*credits;
	}
	private void updateAverageGrade() {
		averageGrade = totalGrade/grades;
	}
	public double getAverageGrade() {
		updateAverageGrade();
		return averageGrade;
	}
}
