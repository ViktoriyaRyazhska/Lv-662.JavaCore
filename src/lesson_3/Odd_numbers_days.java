package lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd_numbers_days {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 task_1(br);
		 task_2(br);
	}

	public static void task_1(BufferedReader br) throws IOException {
		System.out.println("Please enter the number 1");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Please enter the number 2");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Please enter the number 3");
		int c = Integer.parseInt(br.readLine());
		int d = 0;

		if (a % 2 != 0) {
			d++;
		}
		if (b % 2 != 0) {
			d++;
		}
		if (c % 2 != 0) {
			d++;
		}
		System.out.println(d);

	}
	
 

	public static void task_2(BufferedReader br) throws IOException {
		System.out.println("Please enter the number of the day of the week? (1/2/3/4/5/6/7)");
		String input = br.readLine();

		switch (input.toLowerCase()) {
		case "1":
			System.out.println("Monday");
			System.out.println("Понеділок");
			break;
		case "2":
			System.out.println("Tuesday");
			System.out.println("Вівторок");
			break;
		case "3":
			System.out.println("Wednesday");
			System.out.println("Середа");
			break;
		case "4":
			System.out.println("Tursday");
			System.out.println("Четвер");
			break;
		case "5":
			System.out.println("Friday");
			System.out.println("Пятниця");
			break;
		case "6":
			System.out.println("Saturday");
			System.out.println("Субота");
			break;
		case "7":
			System.out.println("Sunday");
			System.out.println("Неділя");
			break;
		default:
			System.out.println("Wrong!");
		}
	}

}
