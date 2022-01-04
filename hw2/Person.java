package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person() {}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}
	
	public void input(BufferedReader br) throws IOException {
		System.out.print("Please enter persons first name: ");
		firstName = br.readLine();
		System.out.print("Please enter persons last name: ");
		lastName = br.readLine();
		System.out.print("Please enter persons year of birth (in 4 digit format, e.g. 1979): ");
		birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		System.out.println("Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]");
	}
	
	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
}
