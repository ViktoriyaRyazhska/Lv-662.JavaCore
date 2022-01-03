package l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the day number: 1, 2, 3, 4, 5, 6, 7");
		int x = Integer.parseInt(br.readLine());
		
		switch (x) {
		case 1:
			System.out.println("Monday");
			System.out.println("Понеділок");
			break;
		case 2:
			System.out.println("Tuesday");
			System.out.println("Вівторок");
			break;
		case 3:
			System.out.println("Wensday");
			System.out.println("Cереда");
			break;
		case 4:
			System.out.println("Thursday");
			System.out.println("Четвер");
			break;
		case 5:
			System.out.println("Friday");
			System.out.println("П'ятниця");
			break;
		case 6:
			System.out.println("Suturday");
			System.out.println("Субота");
			break;
		case 7:
			System.out.println("Sunday");
			System.out.println("Неділя");
		}
		
	}

}
