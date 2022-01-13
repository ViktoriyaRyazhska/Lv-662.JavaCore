package PracticalTasks_5;

public class Array {
	public static void main(String[] args) {

		int[] arr = { 3, -2, 7, -5, -4, 4, -8, 1, 6, -3 };
		int max = arr[0];
		int i = 0;
		int sum = 0;

		// the biggest of these numbers

		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		System.out.println("Max = " + max);

		// the sum of positive numbers in the array

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] > 0) {
				sum += arr[k];
			}
		}
		System.out.println("Sum = " + sum);

		// the amount of negative numbers in the array

		int amountOfNegative = 0;
		for (int a : arr) {
			if (a < 0) {
				amountOfNegative++;
			}
		}
		System.out.println("Amount of negative numbers = " + amountOfNegative);

		// What values there are more: negative or positive?

		int amountOfPositive = 0;
		for (int b : arr) {
			if (b > 0) {
				amountOfPositive++;
			}
		}
		System.out.println("Amount of positive numbers = " + amountOfPositive);
		if (amountOfPositive > amountOfNegative) {
			System.out.println("There are more positive numbers!");

		}
		if (amountOfPositive < amountOfNegative){
			System.out.println("There are more negarive numbers!");
			
		}
		else {
			System.out.println("Amount of both is equal!");
		}

	}

}