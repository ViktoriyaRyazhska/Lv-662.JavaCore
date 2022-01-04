package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeekByNumberApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter number of the day of the week (1-7): ");
		int number = Integer.parseInt(br.readLine());
		DayOfWeek dayOfWeek = null;
		
		switch (number) {
		case 1:
			dayOfWeek = DayOfWeek.MONDAY;
			break;
		case 2:
			dayOfWeek = DayOfWeek.TUESDAY;
			break;
		case 3:
			dayOfWeek = DayOfWeek.WEDNESDAY;
			break;
		case 4:
			dayOfWeek = DayOfWeek.THURSDAY;
			break;
		case 5:
			dayOfWeek = DayOfWeek.FRIDAY;
			break;
		case 6:
			dayOfWeek = DayOfWeek.SATURDAY;
			break;
		case 7:
			dayOfWeek = DayOfWeek.SUNDAY;
			break;
		
		default:
			System.out.println("You've entered wrong number");
			System.exit(0);
		
		}
		System.out.println(dayOfWeek.getUa());
		System.out.println(dayOfWeek.getEn());
		System.out.println(dayOfWeek.getEs());
	}
}
