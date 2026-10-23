package oop;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseCode;
	private String courseName;
	private int credits;
	private List<Student>enrolledStudents;
	
	public Course(String courseCode, String courseName, int credits) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.credits = credits;
		enrolledStudents = new ArrayList<>();
	}
	
	public void enrollStudent(Student student) {
		if(find(student)) {
			enrolledStudents.add(student);
		}
	}
	public void withdrawStudent(Student student) {
		if(find(student)) {
			enrolledStudents.remove(student);
		}
	}
	private boolean find(Student student) {
		for(Student s: enrolledStudents) {
			if(s == student) {
				return true;
			}
		}
		System.out.println("No Student Found!");
		return false;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getCredits() {
		return credits;
	}

	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}
}
