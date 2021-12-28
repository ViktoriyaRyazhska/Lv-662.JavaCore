package com.company;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    Date date = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy");


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getAge() {
        return (Integer.parseInt(formatForDateNow.format(date)) - this.birthYear);
    }

    public void input() throws IOException {
        Scanner br = new Scanner(System.in);
        int i;
        if (this.lastName != null || this.firstName != null) {
            this.output();
            System.out.print("Year of birth of " + this.firstName + ": ");
            if (br.hasNextInt()) {
                i = br.nextInt();
                if (i < Integer.parseInt(formatForDateNow.format(date))) {
                    this.birthYear = i;
                } else {
                    System.out.println(this.firstName + ", your year of birth is greater than the current one " + '\n' + "__________________________");
                }
            } else {
                System.out.println("Incorrect year of birth format" + '\n' + "__________________________");
            }
            System.out.println("_______________________");
        } else {
            System.out.print("Name: ");
            this.firstName = br.nextLine();
            System.out.print("Surname of " + this.firstName + ": ");
            this.lastName = br.nextLine();
            System.out.print("Year of birth of " + this.firstName + ": ");
            if (br.hasNextInt()) {
                i = br.nextInt();
                if (i < Integer.parseInt(formatForDateNow.format(date))) {
                    this.birthYear = i;
                } else {
                    System.out.println(this.firstName + ", your year of birth is greater than the current one " + '\n' + "__________________________");
                }
            } else {
                System.out.println("Incorrect year of birth format " + '\n' + "__________________________");
            }
            System.out.println("__________________________");
        }
    }


    public void output() {
        System.out.println("Person{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", birthYear=" + this.birthYear +
                '}');
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }



    public void setBirthYear(int birthYear) {
        if (birthYear < Integer.parseInt(formatForDateNow.format(date))) {
            this.birthYear = birthYear;
        } else {
            System.out.println( this.firstName + ", your year of birth is greater than the current one ");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
