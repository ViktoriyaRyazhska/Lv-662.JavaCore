package l9HWQ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Anne", 5);
		Student s2 = new Student("Becky", 4);
		Student s3 = new Student("Emma", 3);
		Student s4 = new Student("Darlene", 2);
		Student s5 = new Student("Callie", 1);
		
		List<Student> stdnts = new ArrayList<>();
		stdnts.addAll(Stream.of(s1, s2, s3, s4, s5).collect(Collectors.toList()));
		
		System.out.println("Sort by name: ");
		Collections.sort(stdnts, new Namesort());
		Student.printStudents(stdnts, 1);
		

		System.out.println("Sort by course: ");
		Collections.sort(stdnts, new Coursesort());
		Student.printStudents(stdnts, 1);

	}

}

