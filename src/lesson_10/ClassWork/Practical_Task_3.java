package lesson_10.ClassWork;

import lesson_9.Homework.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Practical_Task_3 {

    public static boolean RegularExpression(String nameCheck) {
        String pattern = ("[A-Za-z0-9_]{3,15}");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(nameCheck);
        return m.matches();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        // Using regular expressions implement checking the user name for validity.
        // Input five names in the main method .
        // Output a message to the console of the validation of each of the entered names.

        System.out.println("Task 3");
        System.out.println("Please input the first user name");
        String name1 = br.readLine();
        System.out.println("Please input the second user name");
        String name2 = br.readLine();
        System.out.println("Please input the third user name");
        String name3 = br.readLine();
        System.out.println("Please input the fourth user name");
        String name4 = br.readLine();
        System.out.println("Please input the fifth user name");
        String name5 = br.readLine();

        List<String> Names = new ArrayList<>();
        Names.add(name1);
        Names.add(name2);
        Names.add(name3);
        Names.add(name4);
        Names.add(name5);

        for (int i = 0; i < Names.size(); i++) {
            System.out.println(RegularExpression(Names.get(i)));
        }

    }
}