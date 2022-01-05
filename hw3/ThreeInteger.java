package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeInteger {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] numbers = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter first number: ");
		numbers[0] = Integer.parseInt(br.readLine());
		System.out.print("Please enter second number: ");
		numbers[1] = Integer.parseInt(br.readLine());
		System.out.print("Please enter third number: ");
		numbers[2] = Integer.parseInt(br.readLine());
		br.close();
		
		int max = numbers[0], min = max;
		
		for (int i : numbers) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
		}
		
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
	}

}
