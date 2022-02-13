package hw11.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String s;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
			System.out.println("Reading from file1.txt ...");
			while ((s = reader.readLine()) != null) {
					list.add(s);
			}
			System.out.println("Done.");
			reader.close();
			BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
			System.out.println("Writing to file2.txt ...");
			writer.write("Number of lines in file1 is " + list.size() + ".\n");
			writer.write("The longest line in file1 is:\n");
			String longest = list.get(0);
			for (String string : list) {
				if (string.length() > longest.length()) longest = string; 
			}
			writer.write("\"" + longest + "\"\n");
			writer.write("Oleksandr V Riabko (21.12.79)\n");
			System.out.println("Done.");
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
