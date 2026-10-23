package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
	private String studentID;
	private String firstName;
	private String lastName;
	private List <Course> enrolledCourses;
	private Map<Course, Grade> grades;
	private Grade grade;
	
	public Student(String studentID, String firstName, String lastName) {
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		enrolledCourses = new ArrayList<>();
		grades = new HashMap<>();
	}
	
	public void enrollCourse(Course course) {
		course.enrollStudent(this);
	}
	public void withDrawCourse(Course course) {
		course.withdrawStudent(this);
	}
	public double getGPA() {
		return -1;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public double getAverageGrade() {
		return grade.getAverageGrade();
	}

	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public Map<Course, Grade> getGrades() {
		return grades;
	}
}
