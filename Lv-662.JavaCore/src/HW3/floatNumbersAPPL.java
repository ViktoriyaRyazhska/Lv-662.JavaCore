package HW3;

//read 3 float numbers and check: are they all belong to the range [-5,5];

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class floatNumbersAPPL {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float[] nums = new float[3];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number\t");
			nums[i] = Float.parseFloat(br.readLine());
		}

		floatChecker floatchecker = new floatChecker();
		for (float f : nums) {
			floatchecker.checkIfIsSuitable(f);
		}
		
		switch (floatChecker.count) {
		case 0:
			System.out.println("Any of the numbers does not belong to the interval");
			break;
		case 1:
			System.out.println("One number belongs to the interval");
			break;
		case 2:
			System.out.println("Two numbers belong to the interval");
			break;
		case 3:
			System.out.println("All numbers belong to the range!");
			break;
		default:
			System.out.println("Error");
		}
	}
}