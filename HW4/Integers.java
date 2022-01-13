package l5;
public class Integers {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, -3, 4, 5, -6, 7, 8, 9, -9};
		
		int max = numbers[0];
		int h = 0;
		while (h <  numbers.length) {
			if (numbers[h] > max) {
				max = numbers[h];
			}
			h++;
		}
		System.out.println("Maximum number is " + max);
		
		int sum = 0;
		for (int a = 0; a < numbers.length; a++) {
			if (numbers[a] >= 0 ) {
			sum += numbers[a];
			}
		}
		
		System.out.println("The sum of positive numbers is " + sum);
		
		int amount = 0;
		for (int k : numbers) {
			if (k < 0) {
				amount++;
			}
		}
		System.out.println("The ammount is " + amount);
		
		int  positive = 0;
		for (int m : numbers) {
			if (m > 0) {
				positive++;
			}
		}
		System.out.println("The count of positive numbers is " + positive);
		
		if (positive > amount) {
			System.out.println("Number of positive numbers is higher.");
		} else {
			System.out.println("Number of negative numbers is higher.");
		}
	
	}

}
