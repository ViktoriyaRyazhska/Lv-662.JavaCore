package PracticeEleven;

import java.time.DayOfWeek;
import java.time.LocalDate;


import static java.time.temporal.TemporalAdjusters.firstInMonth;


public class DateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Today is " +  now.getDayOfWeek());

        LocalDate firstMondayOfNextMonth = now.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println("date of first Monday for current month "  + firstMondayOfNextMonth);

    }
}
