package hw9_t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FiveWords {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //task1

        System.out.println("Enter sentence of 5 words");
        String sentence = br.readLine().toLowerCase();

        String[] arr = sentence.split(" ");

        String theLongest = "";

        for(String word : arr){
            if (word.length() > theLongest.length()){
                theLongest = word;
            }
        }
        System.out.println("The longest word is: " + theLongest);

        int i = theLongest.length();
        System.out.println("The number of its letters is: " + i);


        StringBuilder sb = new StringBuilder(arr[1]);
        sb.reverse();
        System.out.println("Second word in reverse order: " + sb);

    }
}
