package l3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public int getbirthYear() {
		return birthYear;
	}

	public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person() {
	}

	public Person(String fn, String ln) {
		setfirstName(fn);
		setlastName(ln);
	}

	public Person(String fn, String ln, int by) {
		setfirstName(fn);
		setlastName(ln);
		setbirthYear(by);
	}

	public int getAge() {
		return (2021 - birthYear);
	}

	public void changeName(String fn, String ln) {
		setfirstName(fn);
		setlastName(ln);
	}

	public void input() throws IOException {
		System.out.println("Please enter your first name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		setfirstName(br.readLine());
		System.out.println("Please enter your last name");
		setlastName(br.readLine());
		System.out.println("Please enter birth year");
		setbirthYear(Integer.parseInt(br.readLine()));
	}

	@Override
	public String toString() {
		return "Person" + " [first name = " + firstName + ", last name = " + lastName + ", birth year = " + birthYear
				+ "]";
	}
}

