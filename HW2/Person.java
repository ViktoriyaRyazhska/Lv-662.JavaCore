package java3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Person {
	private String lastName;
	private String name;
	private int birthYear;
	public static int year = 2022;
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;

	}
    public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
	}
	public String getlastName () {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public int birthYear() {
		return birthYear;
	}

		public void birthYear(int birthYear) {
			this.birthYear = birthYear;
		}

			public void input (BufferedReader br) throws IOException{
				System.out.println("Enter the birth year");
				 this.birthYear=Integer.parseInt(br.readLine());
				 System.out.println("Enter your name");
				 this.name=br.readLine();
				 System.out.println("Enter your last name");
				 this.lastName=br.readLine();
			}

			public void output() {
				System.out.print( name + " " + lastName );
				}
	@Override
		public String toString() {
		return "Person name=" + name + ", lastName=" + lastName+ ", Age=" + (year-birthYear)  ;
	}
	public void changeName (BufferedReader br) throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nIf you want to change your name, " + name + "? enter name");
		this.name = br1.readLine();
	}
}
