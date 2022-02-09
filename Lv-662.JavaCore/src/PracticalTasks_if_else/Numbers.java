package PracticalTasks_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	int countOfOdd = 0;

	public void CheckIfIsOdd(int x) {
		if (x % 2 != 0) {
			countOfOdd++;
		}
	}

	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int [3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
//		System.out.println("Count of odd numbers is: " + countOfOdd);

	}
}