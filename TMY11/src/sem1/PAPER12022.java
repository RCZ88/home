package sem1;

public class PAPER12022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static String[]markToGrade(int[]mark){
		String[]grade = new String[mark.length];
		for(int i = 0; i<mark.length; i++) {
			int m = mark[i];
			if(m < 40) {
				grade[i] = "Fail";
			}else if(m >= 40) {
				grade[i] = "Pass";
			}else if(m >= 60) {
				grade[i] = "Merit";
			}else if(m >= 80) {
				grade[i] = "Distinction";
			}
		}
		return grade;
	}
	static void meritOrDistinction(String []grade, String[]students) {
		for(int i = 0; i<students.length; i++) {
			if(grade[i].equals("Merit") || grade[i].equals("Distinction")) {
				System.out.println(students[i]);
			}
		}
	}
	static double getPerim(double r) {
		return 2 * r * Math.PI;
	}
	static double getArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}

}
