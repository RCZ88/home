package oop;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GradeManager {
	private List<Student>students;
	private List<Course>courses;
	private Map<Student, Double> averageGrades;
	
	 public GradeManager() {
		 students = new ArrayList<>();
	     courses = new ArrayList<>();
	     averageGrades = new LinkedHashMap<>();
	 }
	
	public void addStudent(String studentID, String firstName, String lastName) {
		Student student = new Student(studentID, firstName, lastName);
		students.add(student);
	}
	public List<Student> getStudents() {
		return students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public Map<Student, Double> getAverageGrades() {
		return averageGrades;
	}

	public void removeStudent(String studentId) {
		students.remove(findStudent(studentId));
	}
	public void addCourse(String courseCode, String courseName, int credits) {
		Course c = new Course(courseCode, courseName, credits);
		courses.add(c);
	}
	public void removeCourse(String courseCode) {
		courses.remove(findCourse(courseCode));
	}
	public void assignGrade(String studentId, String courseCode, double courseGrade) {
		Student student = findStudent(studentId);
		Course course = findCourse(courseCode);
		
		Grade grade = new Grade(courseGrade);
		student.getGrades().put(course, grade);	
	}
	
	public void updateGrade(String studentId, String courseCode, double newGrade) {
		Student student = findStudent(studentId);
		Course course = findCourse(courseCode);
		
		Grade grade = new Grade(newGrade);
		boolean gradeUpdated = false;
		for(Entry<Course, Grade> entry : student.getGrades().entrySet()) {
			Course c = entry.getKey();
			Grade g= entry.getValue();
			if(c.getCourseCode().equals(courseCode)) {
				entry.setValue(grade);
				gradeUpdated  =true;
				break;
			}
		}
		if(!gradeUpdated) {
			assignGrade(studentId, courseCode, newGrade);
		}
	}
	public Map<Course, Grade> getStudentGrades(String studentId){
		return findStudent(studentId).getGrades();
	}
	public double getStudentGPA(String studentId) {
		return findStudent(studentId).getGPA();
	}
	public Map<Student, Grade> getCourseGrades(String courseCode){
		Map<Student, Grade> courseGrades = null;
		for(Student s : findCourse(courseCode).getEnrolledStudents()) {
			for(Entry<Course, Grade> entry : s.getGrades().entrySet()) {
				if(entry.getKey() == findCourse(courseCode)) {
					courseGrades.put(s, entry.getValue());
				}
			}
		}
		return courseGrades;
	}
	public List<Student> getTopStudents(int numStudents) {
	    ArrayList<Student> topStudents = new ArrayList<>();
	    averageGrades = new LinkedHashMap<>(); // Initialize averageGrades map
	    for (Student s : students) {
	        averageGrades.put(s, s.getAverageGrade());
	    }
	    // Sort the averageGrades map by value in descending order
	    averageGrades = sortByValue(averageGrades);
	    int count = 0;
	    for (Map.Entry<Student, Double> entry : averageGrades.entrySet()) {
	        if (count >= numStudents) {
	            break;
	        }
	        topStudents.add(entry.getKey()); // Add the student to topStudents list
	        count++;
	    }
	    return topStudents;
	}
	
	private Student findStudent(String studentId) {
		for(Student s:students) {
			if(s.getStudentID().equals(studentId)) {
				return s;
			}
		}
		System.out.println("No Student Found");
		return null;
	}
	
	private Course findCourse(String courseCode) {
		for(Course c:courses) {
			if(c.getCourseCode().equals(courseCode)) {
				return c;
			}
		}
		System.out.println("No Course Found");
		return null;
	}
	
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
