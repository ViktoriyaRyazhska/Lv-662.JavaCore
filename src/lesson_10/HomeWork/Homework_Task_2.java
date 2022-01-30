package lesson_10.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_Task_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Enter a sentence that contains the words between more than one space.
        // Convert all spaces, consecutive, one.
        // For example, if we introduce the sentence "I    am      learning     Java   Core»,
        // we have to get the "I'm learning Java Core»

        System.out.println("Please enter the sentance");
        String sentence = br.readLine();
        System.out.println(sentence.replaceAll("\\s+", " "));

    }
}
