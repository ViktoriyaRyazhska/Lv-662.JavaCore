package l8HWQ1;

public class Main {

	public static void main(String[] args) {
		FullName me = new FullName("Katerina", "Perez");
		Student s1 = new Student(me, 19, "JavaCore");
		s1.info();
		System.out.println(s1.activity());
		System.out.println("****************************");
		
		FullName john = new FullName("John", "Doe");
		Student s2 = new Student(john, 35, "Knitting");
		s2.info();
		System.out.println(s2.activity());

	}

}
