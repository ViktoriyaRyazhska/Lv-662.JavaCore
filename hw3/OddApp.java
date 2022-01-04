package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] numbers = new int[3];
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter first number: ");
		numbers[0] = Integer.parseInt(br.readLine());
		System.out.print("Please enter second number: ");
		numbers[1] = Integer.parseInt(br.readLine());
		System.out.print("Please enter third number: ");
		numbers[2] = Integer.parseInt(br.readLine());

		for (int i : numbers) {
			if (i % 2 != 0) {
				count++;
			}
		}
		
		System.out.println("You've entered " + count + " odd numbers");
	}
}
