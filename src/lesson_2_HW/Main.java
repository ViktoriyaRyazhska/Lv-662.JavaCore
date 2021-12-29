package lesson_2_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
	    Person p1 = new Person();
	    Person p2 = new Person();
	    Person p3 = new Person();
	    Person p4 = new Person();
	    Person p5 = new Person();
	    
	  
	    p1.input(br);
	    p1.output();
	    p1.getAge();   
	    p1.changeName(br);
	    p1.output();
	    p1.getAge();
	    System.out.println();

	    p2.input(br);
	    p2.output();
	    p2.getAge();   
	    p2.changeName(br);
	    p2.output();
	    p2.getAge();
	    System.out.println();

	    p3.input(br);
	    p3.output();
	    p3.getAge();   
	    p3.changeName(br);
	    p3.output();
	    p3.getAge();
	    System.out.println();

	    p4.input(br);
	    p4.output();
	    p4.getAge();   
	    p4.changeName(br);
	    p4.output();
	    p4.getAge();
	    System.out.println();

	    p5.input(br);
	    p5.output();
	    p5.getAge();   
	    p5.changeName(br);
	    p5.output();
	    p5.getAge();
	    System.out.println();
	}
	
}