package Task_9HM.Task1;

//Enter in the console sentence of five words.
//display the longest word in the sentence
//determine the number of its letters
//bring the second word in reverse order

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HM9_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentences = sc.nextLine();
        String []arrWord = sentences.split(" ");
        int number = 0;
        String longestWord = Arrays.stream(sentences.split(" "))
                .max(Comparator.comparingInt(String::length)).orElse(null).toString();

        //The longer word
        System.out.println(longestWord + " , length - " + longestWord.length());

        //Number of word
        for (int i = 0 ; i < arrWord.length;i++){
            number = (arrWord[i].equalsIgnoreCase(longestWord))?i:0;
        }
        System.out.println(number+1);

        //revers second word
        String input = arrWord[1];
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
