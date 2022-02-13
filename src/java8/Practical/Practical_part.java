package java8.Practical;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practical_part {
    public static void main(String[] args) {
        Random n = new Random();
        //   Task 1
        n.ints(1, 6).limit(2).forEach(System.out::println);

        //   Task 2
        n.ints(1, 100).limit(2).sorted().forEach(System.out::println);

        //Task 3
        List<Integer> longs = n.ints( 5 ).boxed().collect(Collectors.toList() );
        Integer largest = longs.stream().max(Integer::compare).get();
        System.out.println(largest);

        //Task 4


    }
}

