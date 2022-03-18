package l12HWQ4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) {
		String file1Name = "file1.txt";
		String file2Name = "file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		List<String> contents = new ArrayList<>();

		try {
			fr = new FileReader(file1Name);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;
			int longest = 0;
			System.out.println("Read data from file 1: " + file1Name);
			while ((s = br.readLine()) != null) {
				contents.add(s);
				if (s.length() > contents.get(longest).length()) {
					longest = count;
				}
				++count;
			}
			br.close();

			fw = new FileWriter(file2Name);
			bw = new BufferedWriter(fw);
			System.out.println("Write data to file: " + file2Name + "\n");
			bw.write("The number of lines in the file is: " + count + "\n");
			bw.write("The longest line in the file is: " + contents.get(longest) + "\n");
			bw.write("Name: Katerina\nAge: 19 ");
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
