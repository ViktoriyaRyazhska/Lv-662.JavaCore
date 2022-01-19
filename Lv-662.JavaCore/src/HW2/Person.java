package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {

	
	
	private static int count = 0;
	{
		count++;
	}

	private String firstName;
	private String lastName;
	private int birthYear;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return LocalDate.now().getYear() - this.birthYear;
	}

	public void input(BufferedReader br) throws IOException {
		System.out.println("Enter your name *(person No)  " + count + ": ");
		this.firstName = br.readLine();
		System.out.println("Enter your surname *(person No)  " + count + ": ");
		this.lastName = br.readLine();
		System.out.println("Enter the birth year *(person No)  " + count + ": ");
		this.birthYear = Integer.parseInt(br.readLine());

	}

	public void output() {
		System.out.println("Person [" + "firstName: " + this.firstName + ", lastName: " + this.lastName
				+ ", birthYear: " + this.birthYear + ']');
	}

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

	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}