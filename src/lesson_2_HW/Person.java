package lesson_2_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
	}


	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person() {
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
	
	
	
	public void getAge() {
		System.out.println(LocalDate.now().getYear() - birthYear);
	}
	
	
	public void input(BufferedReader br) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		 System.out.println("Please enter the birth year");
		 this.birthYear=Integer.parseInt(br.readLine());
		 System.out.println("Please enter your first name");
		 this.firstName=br.readLine();
		 System.out.println("Please enter your last name");
		 this.lastName=br.readLine();
	}
	
	
	public void output() {
		System.out.print("Person name is " + firstName + " " + lastName + " and you are ");
	}
	
	
	public void changeName(BufferedReader br)throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nWould you like to change your first name, " + firstName + "? If yes, please enter name");
		this.firstName=br.readLine();
		
		
	}
	}
	
	
