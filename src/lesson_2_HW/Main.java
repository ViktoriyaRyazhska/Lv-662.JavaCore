package lesson_2_HW;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
	    Person p1 = new Person();
	    Person p2 = new Person();
	    Person p3 = new Person();
	    Person p4 = new Person();
	    Person p5 = new Person();
	    
	  
	    p1.input();
	    System.out.print(p1.output());
	    System.out.println(p1.getAge());
	    p1.changeName();
	    System.out.print(p1.output());
	    System.out.println(p1.getAge());

	    p2.input();
	    System.out.print(p2.output());
	    System.out.println(p2.getAge());
	    p2.changeName();
	    System.out.print(p2.output());
	    System.out.println(p2.getAge());
	
	    p3.input();
	    System.out.print(p3.output());
	    System.out.println(p3.getAge());
	    p3.changeName();
	    System.out.print(p3.output());
	    System.out.println(p3.getAge());
	    
	    p4.input();
	    System.out.print(p4.output());
	    System.out.println(p4.getAge());
	    p4.changeName();
	    System.out.print(p4.output());
	    System.out.println(p4.getAge());
	    
	    p5.input();
	    System.out.print(p5.output());
	    System.out.println(p5.getAge());
	    p5.changeName();
	    System.out.print(p5.output());
	    System.out.println(p5.getAge());
	}
	
}