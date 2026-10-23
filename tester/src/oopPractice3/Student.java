package oopPractice3;

public class Student {
	private int studentID;
	private String studentName;
	 private Loan[] booksBorrowed = new Loan[10];
	 private int numBooks = 0;
	 public Student(int studentID, String studentName)
	 {
	 this.studentID=studentID;
	 this.studentName=studentName;
	 }
	 public void addLoan(Loan loan) {
		booksBorrowed[numBooks] = loan;
		numBooks++;
			
	}
	public String getStudentName() {
		// TODO Auto-generated method stub
		return studentName;
	}
	public Loan getLoan(int i) {
		// TODO Auto-generated method stub
		return booksBorrowed[i];
	}
	
	public void printBooksBorrowed() {
		for (int i = 0; i < numBooks; i++) {
	        System.out.println("Title: "+booksBorrowed[i].getBookTitle()+ " ID: "+ booksBorrowed[i].getBookID());
	    }
	}
	 
}
