package Lecture12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Career {
	public static void main(String[] args) throws IOException {
		String fileName = "/Users/Lili/eclipse-workspace/Lecture_9/src/Lecture12/Career.txt";
		FileReader fr = null;
		BufferedReader br = null;
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		String s = null;

		int count = 0;
		try {
			while ((s = br.readLine()) != null) {
				String[] array = s.lines().toArray(String[]::new);
				System.out.println("row " + ++count + ": " + Arrays.toString(array));
				System.out.println(s.length());
//				String lines[] = s.split("\\n");

			}
//			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Number of rows is " + count + ".");
	}
}
