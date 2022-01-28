package hw8.homework_3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Bob", 5));
		students.add(new Student("Mark", 3));
		students.add(new Student("Carla", 3));
		students.add(new Student("Angelina", 5));
		students.add(new Student("Kate", 5));
		
		Student.printStudents(students, 5);
		System.out.println();
		Student.sortByName(students);
		System.out.println("List of students ordered by name:");
		System.out.println(students);
		System.out.println();
		Student.sortByCourse(students);
		System.out.println("List of students ordered by course:");
		System.out.println(students);
		
	}

}
