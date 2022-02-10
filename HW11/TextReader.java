package Lecture12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextReader {

	private static String s;

	public static void main(String[] args) {
		try {
			try (BufferedReader br = new BufferedReader(new FileReader("/Users/Lili/Svit.txt"))) {
				ArrayList<String> row = new ArrayList<>();
				while ((s = br.readLine()) != null) {
					row.add(s);
					System.out.print(s + " (" + s.length() + " chars)\n");
				}
				int largestString = row.size();
				int index = 0;
				for (int i = 0; i < row.size(); i++) {
					if (row.get(i).length() > largestString) {
						largestString = row.get(i).length();
						index = i;
					}
				}
				System.out.println("String " + (index + 1) + " is the largest and it size " + largestString);

				int shortestString = row.size();
				int ind = 0;
				for (int i = 0; i < row.size(); i++) {
					if (row.get(i).length() < shortestString && row.get(i).length() != 0) {
						shortestString = row.get(i).length();
						ind = i;
					}
				}
				System.out.println("String " + (ind + 1) + " is the shortest and it size " + shortestString);

				List<String> matches = new ArrayList<String>();
				for (String s : row) {
					if (s.contains("світ")) {
						matches.add(s);
					}
				}
				System.out.println("Those strings contain word \"світ\" " + matches);
				br.close();
			}
			
			// чи можна видрукувати стрінги на консолі окремими лініями?

		} catch (Exception ex) {
			System.out.println();
		}

	}

}
