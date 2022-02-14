package hw12.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Print n random numbers on console using Java 8: ");
        random.ints(1, 100).limit(5).forEach(System.out::println);
        System.out.println("Print n random numbers on console using Java 8 in a sorted order: ");
        random.ints(1, 100).limit(5).sorted().forEach(System.out::println);
        System.out.println("Using Java 8 show the biggest number from n random numbers: ");
        System.out.println(random.ints(1, 100).limit(5).summaryStatistics().getMax());
        System.out.println("Show which today is a day of a week: ");
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println("Show a date of first Monday for current month: ");
        System.out.println(LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY)));

        List<String> companies = Arrays.asList("Microsoft", "Google", "Amazon", "Apple");
        System.out.println("Sort list of strings by Alphabet: " + companies);
        sortedStrings(companies);
    }

    public static void sortedStrings(List<String> listStrings) {
        System.out.println(listStrings.stream()
                .sorted()
                .collect(Collectors.toList()));

    }
}

