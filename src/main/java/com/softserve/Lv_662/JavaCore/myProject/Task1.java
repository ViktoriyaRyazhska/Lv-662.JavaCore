package com.softserve.Lv_662.JavaCore.myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input natural number: ");
		int number = 0;
		try {
			number = Integer.parseInt(reader.readLine());
			reader.close();
		} catch (NumberFormatException | IOException e) {
			System.out.println("Invalid input data.");
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print(fib(i) + ", ");
		}

	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}
