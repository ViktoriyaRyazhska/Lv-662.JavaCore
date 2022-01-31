package hw9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--- Homework Task 1 ---");
		System.out.print("Enter a five word sentence: ");
		String sentence = reader.readLine();
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(sentence);
		
		List<String> words = new ArrayList<>();
		String longest = "";
		
		while (m.find()) {
			String match = m.group(0);
			words.add(match);
			if (match.length() > longest.length()) {
				longest = match;
			}
		}
		
		System.out.println("The longest (or one of) word in the sentence is: " + longest);
		System.out.println("It has " + longest.length() + " letters.");
		try {
			StringBuilder b = new StringBuilder(words.get(1));
			System.out.println("Here is the second word in reverse order: " + b.reverse());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Your sentence is too short.");
		}
		
		System.out.println();
		System.out.println("--- Homework Task 2 ---");
		System.out.print("Enter a sentence for space optimization: ");
		sentence = reader.readLine();
		System.out.println("Optimized sentence: " + sentence.replaceAll(" +", " "));
			
		System.out.println();
		System.out.println("--- Homework Task 3 ---");
		System.out.print("Enter text that contains several occurrences of US currency: ");
		String text = reader.readLine();
		p = Pattern.compile("\\$\\d*\\.\\d{2}");
		m = p.matcher(text);
		
		int count = 0;
		while (m.find()) {
			System.out.println("Match found: " + m.group(0));
			count++;
		}
		
		if (count == 0) {
			System.out.println("No matches found.");
		}
				
		reader.close();
		
	}
		
}
