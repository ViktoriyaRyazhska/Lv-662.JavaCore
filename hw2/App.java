package hw2;

import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		
		Employee e1 = new Employee();
		e1.setName("Ivan");
		e1.setRate(15);
		e1.setHours(10);
		
		Employee e2 = new Employee("Olga", 20);
		e2.setHours(30);
		
		Employee e3 = new Employee("Petro", 50, 20);
		
		e3.changeRate(25);
		
		System.out.println("Total salary: " + Employee.getTotalSum());
		
		Person p1 = new Person();
		p1.setFirstName("Willy");
		p1.setLastName("Wonka");
		p1.setBirthYear(1995);
		Person p2 = new Person();
		p2.input();
		Person p3 = new Person("Ryan", "Gosling");
		p3.setBirthYear(1980);
		Person p4 = new Person("Keanu", "Reeves");
		p4.setBirthYear(1964);
		Person p5 = new Person("Bill", "Murray");
		p5.setBirthYear(1950);
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
		System.out.println(p3.getFirstName() + " " + p3.getLastName() + " is " + p3.getAge() + " years old");
		
	}

}
