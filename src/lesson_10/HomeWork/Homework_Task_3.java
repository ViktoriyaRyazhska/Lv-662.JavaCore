package lesson_10.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework_Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Implement a pattern for US currency:
        // the first symbol "$", then any number of digits, dot and two digits after the dot.
        // Enter the text from the console that contains several occurrences of US currency.
        // Display all occurrences on the screen.

       System.out.println("Please enter the text");
        String sum = br.readLine();

        String pattern = ("\\$\\d+\\.\\d{2}");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sum);

        while (m.find()) {
            System.out.println(sum.substring(m.start(), m.end()));
        }


    }
}
