package pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;


    public Person() {
    }

    public Person(String firstName, String lastName) {
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

    public int getAge () {
        age = LocalDate.now().getYear() - birthYear;
        return age;


    }


    public void input(BufferedReader br) throws IOException {
        System.out.println("Please enter birth year");
        this.birthYear = Integer.parseInt(br.readLine());
        System.out.println("Please enter first name");
        this.firstName = br.readLine();
        System.out.println("Please enter last name");
        this.lastName = br.readLine();

    }

    public void output() {
        System.out.println("Person " + firstName + " " + lastName + " " + age);
    }

    public void changeName(BufferedReader br) throws IOException {
        System.out.println("To change first name " + firstName + " enter new first name");
        this.firstName = br.readLine();
        System.out.println("To change last name " + lastName + " enter new last name");
        this.lastName = br.readLine();

    }



}
