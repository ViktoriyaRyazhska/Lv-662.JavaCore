package hw2;

import java.io.IOException;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		p1.input();
		p1.output();
		p1.getAge();
		p1.changeName("Oleg", "Kruts"); // Not clear how to implement this method. Implemented simply inputing new name in brackets
		
		Person p2 = new Person();
		p2.input();
		p2.output();
		p2.getAge();
		
		Person p3 = new Person();
		p3.input();
		p3.output();
		p3.getAge();
		
		Person p4 = new Person();
		p4.input();
		p4.output();
		p4.getAge();
		
		Person p5 = new Person();
		p5.input();
		p5.output();
		p5.getAge();
	}

}
