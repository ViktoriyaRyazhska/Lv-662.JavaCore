package PracticeEleven;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Anton", "Sergiy", "Ruslan", "Max");
        System.out.println("Non sorted list");
        list.stream().forEach(System.out::println);

        sortList(list);

        System.out.println("Sorted list");
        list.stream().forEach(System.out::println);
    }

    private static void sortList(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

    }
}