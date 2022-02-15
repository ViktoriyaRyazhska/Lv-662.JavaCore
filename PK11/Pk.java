package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;

public class Pk {

	public static void main(String[] args) {
		
		System.out.println("Рандомные чисела:");
		Random random = new Random();
		random.ints(5, 10).limit(5).forEach(System.out::println);
		
		System.out.println("Отсортированые числа:");
		random.ints(0,100).limit(4).sorted().forEach(System.out::println);
		
		System.out.println("Максимальное число:");
		System.out.println(random.ints(0,100).limit(5).max().getAsInt());
		
		System.out.println("Сегодняшний день:");
		LocalDate d = LocalDate.now();
		System.out.println( d.getDayOfWeek() );  
		
		System.out.println("День по счёту:");
		System.out.println( d.getDayOfWeek().getValue() );
		
		System.out.println("Дата первого понедельника текущего месяца:");
		LocalDate fm = d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(fm);
		
	}
}