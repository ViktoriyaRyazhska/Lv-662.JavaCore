package l3;

public class Appl {
	


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("olga");
		s1.setRait(3);
		
		Student s2 = new Student("Igor");
		s2.setRait(4);
		s2.setRait(5);
		
		Student s3 = new Student("Ivan", 2);
		s3.setRait(4);
		
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(Student.avgRait());
		System.out.println(s1.betterStudent(s3));
	}

}
