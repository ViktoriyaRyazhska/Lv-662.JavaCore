package Fullname;

public class FullNameMain {

	public static void main(String[] args) {
		
		Person s1 = new Student("Tom", "Red", 20, 2);
		Person s2 = new Student("Tim", "White", 22, 3);
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		
	}
}
