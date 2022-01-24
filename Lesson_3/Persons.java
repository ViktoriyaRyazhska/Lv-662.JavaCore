package intra.Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Persons {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Persons() {
	}
	public Persons(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	
	public void input (BufferedReader br) throws IOException {
		System.out.println("Enter the first name");
		this.firstName = br.readLine();
		System.out.println("Enter the last name");
		this.lastName = br.readLine();
		System.out.println("Enter the year of birth");
		this.birthYear = Integer.parseInt(br.readLine());
		
	}
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}

@Override
	public String toString() {
		return "Persons [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}
    public void output () {
    	System.out.println("The name of the person - " +firstName +", Last name - "+ lastName+
    ", Age of the person - "+ getAge());
    }
    public void changeName (BufferedReader br) throws IOException {
    	System.out.println("Enter the new first name");
    	this.firstName = br.readLine();
    	System.out.println("Enter the new last name");
    	this.lastName = br.readLine();
    }
}
