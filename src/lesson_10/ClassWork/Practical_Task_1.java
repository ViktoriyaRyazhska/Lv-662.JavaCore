package lesson_10.ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical_Task_1 {

    public static boolean isSubstring(String string1, String string2) {
        return string2.contains(string1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Enter the two variables of type String. Determine whether the first variable substring second.
        // For example, if you typed «IT» and «IT Academy» you must receive true.
        System.out.println("Task 1");
        String strOne = "Academy";
        String strTwo = "IT Academy";
        System.out.println(isSubstring(strOne, strTwo));

    }
}
