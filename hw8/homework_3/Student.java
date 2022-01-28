package hw8.homework_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	private String name;
	private int course;
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
	public static void printStudents(List<Student> students, int course) {
		
		System.out.println("List of students for course number " + course + " :");
		int count = 1;
		for (Student student : students) {
			
			if (student.getCourse() == course) {
				System.out.println(count + ". " + student.getName());
				count++;
			}
		}
	}
	
	public static void sortByName(List<Student> students){
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
		});
	}
	
	public static void sortByCourse(List<Student> students) {
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getCourse() - s2.getCourse();
			}
		});
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
		
}
