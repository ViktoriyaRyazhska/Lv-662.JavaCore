package Lecture13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;

public class Practical {


	public static void main(String[] args) {
		
		Random random = new Random();
		random.ints(5, 20).limit(5).forEach(System.out::println);
		
		System.out.println();
		
		random.ints().limit(3).sorted().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println(random.ints(2,10).limit(8).max().getAsInt());
		
		System.out.println();
	
		LocalDate now = LocalDate.now();
	
//		LocalDate dayOfWeek = now.of(int dayOfWeek);
//		System.out.println(dayOfWeek);
		System.out.println( now.getDayOfWeek() );       // SUNDAY
		System.out.println( now.getDayOfWeek().getValue() );
		
		LocalDate firstMonday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(firstMonday);
		
	}
}

//Print n random numbers on console using Java 8
//Print n random numbers on console using Java 8 in a sorted order
//Using Java 8 show the biggest number from n random numbers
//Show which today is a day of a week
//Show a date of first Monday for current month
//Write a method for sorting list of Strings using Java 8
