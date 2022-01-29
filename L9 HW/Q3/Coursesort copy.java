package l9HWQ3;

import java.util.Comparator;

public class Coursesort extends Student implements Comparator<Student> {
	
	Coursesort() {}
	
	@Override
	public int compare (Student s1, Student s2) {
		int s1Course = s1.getCourse();
		int s2Course = s2.getCourse();
		return s1Course - s2Course;
	}

}
