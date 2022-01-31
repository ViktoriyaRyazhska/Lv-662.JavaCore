import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	private String name;
	private int course;
	
	public Student(String name, int course) {
		this.name = name;
		this.setCourse(course);
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
		
	@Override
	public String toString() {
		return "\n Student name=" + name + ", course=" + course;
	}

	public static void printStudents(List<Student> students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			  System.out.println(student);

		}
	}
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Tony", 2));
		students.add(new Student("Mary", 5));
		students.add(new Student("James", 3));
		students.add(new Student("Sam", 5));
		students.add(new Student("Polly", 1));
		
		students.sort(Comparator.comparing(Student::getName));
		System.out.println(students);
		
		students.sort(Comparator.comparing(Student::getCourse));
		
		System.out.println(students);
		
	}

}
