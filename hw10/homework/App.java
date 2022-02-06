package hw10.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Enter first number: ");
			double first = Double.parseDouble(reader.readLine());
			System.out.print("Enter second number: ");
			double second = Double.parseDouble(reader.readLine());
			System.out.println(first + " / " + second + " = " + div(first, second));
		
		} catch (NumberFormatException e) {
			System.out.println("Invalid input data. Numbers expected.");
	
		} catch (IOException e) {
			System.out.println("I/O error.");
		}
		
		// With floating-point numbers, arithmetic exception won't be thrown.
		
		int start = 1;
		int end = 10;
		int count = 0;
		int[] numbers = new int[10];
		
		while (count < 10) {
			
			System.out.print("Enter an integer number between " 
			                    + start + " and " + end + " (exclusive): ");
			try {
				numbers[count] = readNumber(start, end, reader);
				start = end;
				end += 10;
				count++;
				
			} catch (NumberFormatException | IOException e) {
				System.out.println("Invalid input data. Not an integer or out of range.");
				continue;
				
			}
		}
		
		System.out.print("1");
		for (int i : numbers) {
			System.out.print(" < " + i);
		}
		System.out.println(" < 100");
		
		try {
			reader.close();
		} catch (IOException e) {
			System.err.println("Failed to close bufferedreader.");
			e.printStackTrace();
		}
				
	}

	public static double div(double a, double b) {
		
		return a / b;
	
	}
	
	public static int readNumber(int start, int end, BufferedReader reader) throws NumberFormatException, IOException {
		int result = Integer.parseInt(reader.readLine());
		if (start < result && result < end) {
			return result;
		
		} else {
			throw new NumberFormatException();
		
		}
	
	}
	
}
