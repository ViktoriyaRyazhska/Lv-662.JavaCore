package HWQ1;

import java.util.Scanner;

public class circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius");
		double rad = input.nextInt();
		System.out.printf("Circumference: %f\n", rad * 2 * 3.14);
		System.out.printf("Area: %f\n", 3.14 * rad * rad);
	}
}