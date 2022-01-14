package l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the month number");
		int month = Integer.parseInt(br.readLine());
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("This month consist of 31 days");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("This month consist of 30 days");
		} else if (month == 2) {
			System.out.println("This month consist of 28 or 29 days");
		} else if (month > 13) {
			System.out.println("The month with this number doesn't exist!");
		}
	}

}
