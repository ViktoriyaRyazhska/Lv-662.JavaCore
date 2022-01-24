package intra.Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_of_persons {

	public static void main(String[] args) throws IOException {
		Persons p1 = new Persons();
	    Persons p2 = new Persons();
		Persons p3 = new Persons();
		Persons p4 = new Persons();
		Persons p5 = new Persons();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("p1");
		p1.input(br);
		System.out.println("p2");
		p2.input(br);
		System.out.println("p3");
		p3.input(br);
		System.out.println("p4");
		p4.input(br);
		System.out.println("p5");
		p5.input(br);
		
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
		System.out.println(p3.getAge());
		System.out.println(p4.getAge());
		System.out.println(p5.getAge());
		
		p1.changeName(br);
		p2.changeName(br);
		p3.changeName(br);
		p4.changeName(br);
		p5.changeName(br);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
}}
