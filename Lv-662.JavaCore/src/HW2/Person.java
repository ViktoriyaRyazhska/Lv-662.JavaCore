package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

	public Person() {
	}

	public Person(String f, String l) {
		this.firstName = f;
		this.lastName = l;
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

	public int getAge() {
		return LocalDate.now().getYear() - getBirthYear();
	}

	public void input(BufferedReader br) throws IOException {
		System.out.println("name");
		this.firstName = br.readLine();
		System.out.println("surname");
		this.lastName = br.readLine();
		System.out.println("birth year");
		this.birthYear = Integer.parseInt(br.readLine());
	}

	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void output() {
		System.out.println("Person [" + "firstName: " + this.firstName + ", lastName: " + this.lastName
				+ ", birthYear: " + this.birthYear + ']');
	}
}
