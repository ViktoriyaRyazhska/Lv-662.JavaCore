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
        System.out.println("Hello. Please enter your surname, name and patronymic");
        String name = br.readLine();

        String[] wordsArr = name.split(" ");
        String one = "Your surnames and initials are " + wordsArr[0] + " " + wordsArr[1].charAt(0) + ". " + wordsArr[2].charAt(0) + ".";
        System.out.println(one);
        System.out.println("Your name is " + wordsArr[1]);
        System.out.println(wordsArr[1] + " " + wordsArr[2] + " " + wordsArr[0]);
    }
}
