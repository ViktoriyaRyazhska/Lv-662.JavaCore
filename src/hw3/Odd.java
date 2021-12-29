package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		System.out.println("Enter first number: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter second number: ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter third number: ");
		int c = Integer.parseInt(br.readLine());
		
		if (a % 2 != 0)
		count ++;
		if (b % 2 != 0)
		count ++;
		if (c % 2 != 0)
	    count ++;
		System.out.println("\nWe have " + count + " odd number(s)");

	}

}
