package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	private Double getPerimeter(double a) throws IOException {

		double pi = 3.14;
		return (2 * a * pi);
	}

	private Double getArea(double a) throws IOException {

		double pi = 3.14;
		return (pi * Math.pow(a, 2));

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the radius of your flower bed: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());

		Circle flower_bed = new Circle();

		double result1 = flower_bed.getPerimeter(r);
		double result2 = flower_bed.getArea(r);
		System.out.println("Perimeter = " + result1);
		System.out.println("Area = " + result2);
	}

}