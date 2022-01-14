package l5;

import java.util.Arrays;

public class Int10 {
	
	public static void main(String[] args) {
		
		int[] integers = {8, 25, 13, 18, 77, -16, -10, -3, -12, -43};
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += integers[i];
		}
		System.out.println("Sum is " + sum);
		
		
		int[] integ = {-8, -25, -13, -18, -77, 16, 10, 3, 12, 43};
		
		int sorting;
		for (int i = 0; i < integ.length; i ++) 
		{
			for (int j = i +1; j < integ.length; j++)
			{
				if (integ[i] < integ[j])
				{
					sorting = integ[i];
					integ[i] = integ[j];
					integ[j] = sorting;
				}
			}
		}
		System.out.println(Arrays.toString(integ));
		
		int positive = 1;
		for (int t = 0; t < 5; t++) {
			if (integ[t] > 0) {
			positive = positive * integ[t];
			}
		}
		System.out.println("Product of positive numbers is " + positive);
	}

}
