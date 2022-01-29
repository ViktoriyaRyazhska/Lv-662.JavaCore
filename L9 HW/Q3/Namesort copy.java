package l9HWQ3;

import java.util.Comparator;

public class Namesort extends Student implements Comparator<Student> {
	
	Namesort() {}
	
	@Override
	public int compare (Student s1, Student s2) {
		String s1Name = s1.getName();
		String s2Name = s2.getName();
		return s1Name.compareTo(s2Name);
	}

}
