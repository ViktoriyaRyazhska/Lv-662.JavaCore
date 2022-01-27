package Task_9Praktice.Task1;

//Enter the two variables of type String. Determine whether the first variable substring second.
//For example, if you typed «IT» and «IT Academy» you must receive true.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String first = "IT Academy";
        String second = first.substring(0,2);
        System.out.println(second);
        System.out.println(first.contains(second));
    }
}