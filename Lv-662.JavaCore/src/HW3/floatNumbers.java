package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read 3 float numbers and check: are they all belong to the range [-5,5];


public class floatNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;

		System.out.println("Enter the first number\t");
		float a = Float.parseFloat(br.readLine());
		
		System.out.println("Enter the second number\t");
		float b = Float.parseFloat(br.readLine());
		
		System.out.println("Enter the third number\t");
		float c = Float.parseFloat(br.readLine());
		
		if (a >= -5 & a <= 5) {
			count++;
		}
		if (b >= -5 & b <= 5) {
			count++;
		}
		if (c >= -5 & c <= 5) {
			count++;
		}
		if (count == 3) {
			System.out.println("All numbers belong to the range!");
		} else {
			System.out.println("Any of the numbers does not belong to the interval");
		}
		

	}

}
