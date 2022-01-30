package lesson_10.ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical_Task_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
        //surnames and initials
        //name
        //name, middle name and last name
        System.out.println("Task 2");
        System.out.println("Hello. What is your surname?");
        String surname = br.readLine();
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Please enter also your patronymic. Thanks!");
        String patronymic = br.readLine();

        String one = "Your surnames and initials are " + surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
        System.out.println(one);
        System.out.println("Your name is " + name);
        System.out.println(name + " " + patronymic + " " + surname);
    }
}
