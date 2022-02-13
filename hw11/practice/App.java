package hw11.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		System.out.println("--- Task 1 ---");
		MyThread task1 = new MyThread("I study Java", 1000, 10);
		task1.start();
		try {
			task1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("--- Task 2 ---");
		MyThread task2_1 = new MyThread("Hello, world", 2000, 5);
		MyThread task2_2 = new MyThread("Peace in the peace", 3000, 5);
		task2_1.start();
		task2_2.start();
		try {
			task2_1.join();
		    task2_2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My name is …");

		System.out.println();
		System.out.println("--- Task 3 ---");

		List<String> list = new LinkedList<>();
		String s;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("mytext.txt"));
			System.out.println("Reading from mytext.txt ...");
			while ((s = reader.readLine()) != null) {
					list.add(s);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list.size() + " lines have been read.");
		System.out.println();
		int longest = list.get(0).length(), 
			shortest = longest;
		int indexOfLongest = 0, indexOfShortest = 0;

		for (int i = 0; i < list.size(); i++) {
			int l = list.get(i).length();
			System.out.println("Line " + (i + 1) + " has length of " + l + ".");
			if (l > longest) {
				longest = l;
				indexOfLongest = i;
			}
			if (l < shortest) {
				shortest = l;
				indexOfShortest = i;
			}
						
		}
		System.out.println();
		System.out.println("Line " + (indexOfShortest + 1) + " is the shortest.");
		System.out.println("Line " + (indexOfLongest + 1) + " is the longest.");
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("20")) {
				System.out.println("Line " + (i + 1) + " contains \"20\" as a substring:");
				System.out.println(list.get(i));
			}
		}
	
	}

}