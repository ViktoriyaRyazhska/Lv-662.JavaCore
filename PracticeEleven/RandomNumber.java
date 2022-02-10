package PracticeEleven;


import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(0,100).limit(20).forEach(System.out::println);
        System.out.println("Sorted list");
        random.ints(0,100).limit(20).sorted().forEach(System.out::println);

        List<Integer> list = Arrays.asList(30, 20, 25, 45, 70, 43, 124);
        IntSummaryStatistics maxNumber = list.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + maxNumber.getMax());

    }
}
