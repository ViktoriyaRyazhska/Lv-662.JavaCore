package hw12.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		Random random = new Random();
		int number = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter positive integer number: ");
			number = Integer.parseInt(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			System.out.println("Invalid input data.");
		}
		System.out.println();
		System.out.println("Printing " + number + " random numbers:");
		System.out.println();
		random.ints().limit(number).forEach(System.out::println);
		System.out.println();
		System.out.println("Printing " + number + " random numbers (ordered):");
		System.out.println();
		random.ints().limit(number).sorted().forEach(System.out::println);
		System.out.println();
		System.out.println("Printing max number from " + number + " random numbers:");
		System.out.println();
		System.out.println(random.ints().limit(number).max().getAsInt());
		System.out.println();
		System.out.println("Today is " + LocalDate.now().getDayOfWeek().toString().toLowerCase() + ".");
		System.out.println();
		System.out.println("Date of first Monday for current month is "
				           + LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)) + ".");
	}

	public static List<String> sort(List<String> list) {
		
		return list.stream().sorted().toList();
	}

}
