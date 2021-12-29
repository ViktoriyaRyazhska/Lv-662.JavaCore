package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private static int count = 0;
	
	{
		count++;

	}
	
	private String firstName;
	private String lastName;
	// Temp solution. need to be changed for proper type
	private int birthYear;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person() {
	}
	
	// Temp solution. need to be changed to get current year
	public void getAge() {
		System.out.println(firstName + " " + lastName + " are " + (2021 - birthYear) + " years old\n");
	}
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first name for person No " + count + ":");
		this.firstName = br.readLine();
		System.out.println("Enter last name for person No " + count + ":");
		this.lastName = br.readLine();
		System.out.println("Enter birthdate for person No " + count + ":");
		this.birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		System.out.println("Person " + count + ": " + firstName + " " + lastName + ", birth year: " + birthYear );
	}
	
	// Not clear how to implement this method. Implemented simply inputing new name in brackets
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		System.out.println("Person " + count + " first name and last name changed to: " + fn + " " + ln + "\n" );
	}
	
}
