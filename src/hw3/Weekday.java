package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weekday {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter weekday number:");
		Integer input = Integer.parseInt(br.readLine());

		switch (input) {
		case 1:
			System.out.println("This is Monday!");
			break;
		case 2:
			System.out.println("This is Tuesday!");
			break;
		case 3:
			System.out.println("This is Wednesday!");
			break;
		case 4:
			System.out.println("This is Thursday!");
			break;
		case 5:
			System.out.println("This is Friday!");
			break;
		case 6:
			System.out.println("This is Saturday!");
			break;
		case 7:
			System.out.println("This is Sunday!");
			break;
		default:
			System.out.println("Wrong day!");
		}
	}

}
