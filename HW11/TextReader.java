package Lecture12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextReader {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/Lili/Lv-662.JavaCore/HW11/Svit.txt"));
			ArrayList<String> row = new ArrayList<>();
			String s;
			while ((s = br.readLine()) != null) {
				row.add(s);


				char[] ch = s.toCharArray();
				
				for (char c : ch) {
					if (Character.isLetter(c)) {
					}
				}
				System.out.print(s + " (" + ch.length + " chars)\n");
				
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
			    	if (row.get(i).length() < shortestString && row.get(i) != " ") {
			    		shortestString = row.get(i).length();
			    		ind = i;
			    	}
			    }
				System.out.println("String " + (ind + 1) + " is the shortest and it size " + shortestString);
				
				String pattern = "світ";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(s);
				while (m.find() ) {
					System.out.println(s.substring(m.start(), m.end()));
				}
			}
			br.close();
		} catch (Exception ex) {
			System.out.println();
		}

	}

}

