package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person p1 = new Person();
		p1.input(br);

		Person p2 = new Person();
		p2.input(br);

		Person p3 = new Person("Sergiy", "Kotsubynskyi");
		p3.changeName("Vikroya", "Pauk");
		p3.setBirthYear(1993);

		Person p4 = new Person("Marta", "Zagora");
		p4.setBirthYear(1976);

		Person p5 = new Person("Max", "Gustiy");
		p5.setBirthYear(2010);

		// DISPLAY
		p1.output();
		System.out.println(p1.getFirstName() + "'s " + "age: " + p1.getAge());
		p2.output();
		System.out.println(p2.getFirstName() + "'s " + "age: " + p2.getAge());
		p3.output();
		System.out.println(p3.getFirstName() + "'s " + "age: " + p3.getAge());
		p4.output();
		System.out.println(p4.getFirstName() + "'s " + "age: " + p4.getAge());
		p5.output();
		System.out.println(p5.getFirstName() + "'s " + "age: " + p5.getAge());

	}

}
