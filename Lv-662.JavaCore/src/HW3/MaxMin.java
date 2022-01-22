package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read 3 integer numbers and write max and min of them;


public class MaxMin {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

		System.out.println("Enter the first number\t");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the second number\t");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the third number\t");
		int c = Integer.parseInt(br.readLine());
		
		int max = 0;
		int min = 0;
		
		
		if (a > b & a > c) {
			max = a;
		}
		if (b > a & b > c) {
			max = b;
		}
		if (c > a & c > b) {
			max = c;
		}
		//=================================
		
		if (a < b & a <c) {
			min = a;
		}
		if (b < a & b < c) {
			min = b;
		}
		if (c < a & c < b) {
			min = c;
		}
		System.out.println("Max\t" + max + "\nMin\t" + min);
		
		
		
		
	

	}

}
