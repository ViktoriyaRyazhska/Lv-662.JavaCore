package l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the month number (from 1 to 12)");
		int month = Integer.parseInt(br.readLine());
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("This month consist of 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("This month consist of 30 days");
			break;
		case 2:
			System.out.println("This month consist of 28 or 29 days");
		}
	}
}
