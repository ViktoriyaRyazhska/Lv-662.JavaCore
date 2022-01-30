package hw9.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("--- Practical Task 1 ---");
		System.out.print("Please enter first string: ");
		String first = reader.readLine();
		System.out.print("Please enter second string: ");
		String second = reader.readLine();
		if (isASubstring(first, second)) {
			System.out.println("First string is a substring of the second string.");
		} else {
			System.out.println("First string is not a substring of the second string.");
		}
		
		System.out.println();
		System.out.println("--- Practical Task 2 ---");
		System.out.print("Enter last name, first name and middle name divided by spaces: ");
		String fullName = reader.readLine();
		Pattern p = Pattern.compile("(\\w+)\\W+(\\w+)\\W+(\\w+)");
		Matcher m = p.matcher(fullName);
		if (m.matches()) {
			StringBuilder b = new StringBuilder(m.group(1));
			b.append(" ").append(m.group(2).charAt(0)).append(".")
			 .append(m.group(3).charAt(0)).append(".");
			System.out.println("Last name and initials: " + b);
			System.out.println("First name: " + m.group(2));
			b.setLength(0);
			b.append(m.group(2)).append(" ").append(m.group(3))
			 .append(" ").append(m.group(1));
			System.out.println("Name, middle name and last name: " + b);
			
		} else {
			System.out.println("Incorrert input data format.");
		}
		
		System.out.println();
		System.out.println("--- Practical Task 3 ---");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Please enter a name: ");
			if (isAValidName(reader.readLine())) {
				System.out.println("This is a valid name.");
			} else {
				System.out.println("This name is invalid.");
			}
		}
						
		reader.close();
		
	}
	
	public static boolean isASubstring(String first, String second) {
		
		Pattern p = Pattern.compile(first);
		Matcher m = p.matcher(second);
		if (m.find()) return true;
		else return false;
			
	}
	
	public static boolean isAValidName(String name) {
		
		Pattern p = Pattern.compile("[\\w_]{3,15}");
		Matcher m = p.matcher(name);
		if (m.matches()) return true;
		else return false;
		
	}

}
