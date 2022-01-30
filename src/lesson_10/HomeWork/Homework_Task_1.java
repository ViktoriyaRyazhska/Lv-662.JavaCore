package lesson_10.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_Task_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("HomeWork. Task 1");

        //Enter in the console sentence of five words.
        System.out.println("Please enter the sentence of five words");
        String sentence = br.readLine();

        String[] wordsArr = sentence.split(" ");

        String theLongestWord = "";
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].length() >= theLongestWord.length()) {
                theLongestWord = wordsArr[i];
            }
        }

        //display the longest word in the sentence
        System.out.println("The longest word in the sentence is " + theLongestWord);

        //determine the number of its letters
        int theLongestWordLength = theLongestWord.length();
        System.out.println("This word contains " + theLongestWordLength + " letters");

        //bring the second word in reverse order
        StringBuilder sb = new StringBuilder(wordsArr[1]);
        System.out.println("" + sb.reverse());
        

    }
}