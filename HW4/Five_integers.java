package l5;

public class Five_integers {

	public static void main(String[] args) {

		int[] numbers = {3, -5, 8, 2, -4};
		
//		Position of second positive number
		int index = 0;
		
		for (int  i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				index ++;
			} 
			if (index == 2) {
				System.out.println("index[" + i + "]=" + numbers[i] + ", position in the line = " + (i + 1));
				break;
			}
		}
		
//		Minimum and it position	
		
		int min = numbers[0];
		int imin = 0;
		int y = 0;
		
		while (y < numbers.length) {
			if (numbers[y] < min) {
				min = numbers[y];
				imin = y;
			}
			y++;
		}
		System.out.print("The lowest number is " + min + ". ");
		System.out.println("It is on the " + (imin + 1) + " place");
		
//		First negative
		
		for (int t = 0; t < numbers.length; t++) {
			if (numbers[t] > 0) {
				System.out.println(numbers[t]);
			} else break;
		}
		
//		Product of even numbers
		
		int product = 1;
		for (int w = 0; w < numbers.length; w++) {
			if (numbers[w] % 2 == 0) {
				product *= numbers[w];
			}
		}
		System.out.println("The product is " + product);
		

	}
}
