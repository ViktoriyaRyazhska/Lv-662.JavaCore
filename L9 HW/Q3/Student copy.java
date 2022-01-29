package l9HWQ3;

import java.util.List;
import java.util.ListIterator;

public class Student {
	private String name;
	private int course;

	Student() {
	}

	Student(String name, int course) {
		setName(name);
		setCourse(course);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return this.course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public static void printStudents(List<Student> students, int course) {
		ListIterator<Student> iterator = students.listIterator();
		System.out.println("Students in the course " + course + ": ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}

	}

}
