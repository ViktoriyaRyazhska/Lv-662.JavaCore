package hw10.practice_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter width of rectangle: ");
			int width = Integer.parseInt(reader.readLine());
			System.out.print("Enter height of rectangle: ");
			int height = Integer.parseInt(reader.readLine());
			System.out.println("Area of this rectangle is "
							   + squareRectangle(height, width) + ".");
		
		} catch (NumberFormatException | IOException | ArithmeticException e) {
			System.out.println("Invalid input data.");
			
		}
	}
	
	public static int squareRectangle(int a, int b) throws ArithmeticException {
		if (a <= 0 || b <= 0) {
			throw new ArithmeticException();
		}
		
		return a * b;
		
	}

}
