package L10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw_task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please, write a sentence, consist of 5 words.");
		String sentence = br.readLine();
		
		String[] arr = sentence.split(" "); 
		String longWord = " ";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() >= arr[j].length())
					longWord = arr[i];				
			}			
		}
		System.out.println("The longest word in sentence is: " + longWord);
		System.out.println("It consist of " + longWord.length() + " lettets");
		
		
		String reverseWord = "";
		StringBuilder sb = new StringBuilder(arr[1]);
		sb.reverse();
		reverseWord += sb.toString();
		System.out.println(reverseWord);

	}

}


//for (String w : arr) {
//StringBuilder sb = new StringBuilder(w);
//sb.reverse();
//reverseWord += sb.toString() + " ";
//} 
