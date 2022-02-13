package java8.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveIf {

    public static void main(String[] args) {

        //There is a list of strings list1.
        // Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)


        List<String> list1 = Arrays.asList("Anna", "Mariia", "Romana", "Gogoza", "", "Faannyy");
        List<String> list2 = list1.stream()
                .filter(string -> !string.isEmpty() && string.length() < 5)
                .collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(list1);
        list3.removeIf(element -> (element.length() > 5));
        list3.removeIf(element -> element.isEmpty());
        System.out.println(list3);
    }
}
