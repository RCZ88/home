package oopPractice3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student temp;
		Student[] borrowers = new Student[100000];
		temp = new Student(93001, "Jones");
		temp.addLoan(new Loan(210001,"The Sky"));
		borrowers[93001] = temp;
		temp = new Student(3012, "Zang");
		temp.addLoan(new Loan(210121, "The Animals"));
		borrowers[3012] = temp;
		borrowers[93001].addLoan(new Loan(210002, "The Spooks"));
		temp = new Student(93002, "Nguyen");
		temp.addLoan(new Loan(210011, "The Ocean"));
		borrowers[93002] = temp;
		System.out.println(borrowers[93001].getStudentName());
		System.out.println(borrowers[93001].getLoan(1).getBookTitle());
		System.out.println(borrowers[3012].getLoan(0).getBookTitle());
		borrowers[93002].printBooksBorrowed();
	}

}
