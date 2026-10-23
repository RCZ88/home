package oopPractice3;
import java.util.*;

public class Loan {
	private int bookID;
	 private String bookTitle;
	 private Date d;
	 static int numBooksLoaned = 0;
	 public Loan(int bookID, String bookTitle)
	 {
	 this.bookID = bookID;
	 this.bookTitle = bookTitle;
	 this.d = new Date(); //set date borrowed
	 numBooksLoaned = numBooksLoaned +1;
	 }
	 public int getBookID()
	 {
	 return this.bookID;
	 }
	 public String getBookTitle()
	 {
	 return this.bookTitle;
	 }
	 public Date getDate()
	 {
	 return this.d;
	 }
	 public void setBookID(int id)
	 {
	 this.bookID = id;
	 }
	 public void setBookTitle(String title)
	 {
	 this.bookTitle = title;
	 }
	 public void setDate(Date d)
	 {
	 this.d = d;
	 }
}
