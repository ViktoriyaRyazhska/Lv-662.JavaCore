package l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month_arrays {
		
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please, enter the month number (from 1 to 12)");
			int month = Integer.parseInt(br.readLine());
			
			int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (month == 1) {
				System.out.println(days[0] + " days in month.");
			} else if (month == 2) {
				System.out.println(days[1] + " days in month.");
			} else if (month == 3) {
				System.out.println(days[2] + " days in month.");
			} else if (month == 4) {
				System.out.println(days[3] + " days in month.");
			} else if (month == 5) {
				System.out.println(days[4] + " days in month.");
			} else if (month == 6) {
				System.out.println(days[5] + " days in month.");
			} else if (month == 7) {
				System.out.println(days[6] + " days in month.");
			} else if (month == 8) {
				System.out.println(days[7] + " days in month.");
			} else if (month == 9) {
				System.out.println(days[8] + " days in month.");
			} else if (month == 10) {
				System.out.println(days[9] + " days in month.");
			} else if (month == 11) {
				System.out.println(days[10] + " days in month.");
			} else if (month == 12) {
				System.out.println(days[11] + " days in month.");
			}
			
		}
}