package hw7.homework_1;

public class App {
	
	public static void main(String[] args) {
		
		Person person1 = new Student(new FullName("John", "Connor"), 17, 3);
		
		System.out.println(person1.info());
		System.out.println(person1.activity());
		
	}

}
