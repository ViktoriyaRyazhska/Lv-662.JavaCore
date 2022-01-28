package hw8.homework1;

import java.util.HashSet;
import java.util.Set;

import static hw8.homework1.Set.*;

public class SetApp {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Boyl");
        set1.add("Jake");
        set1.add("Terry");

        set2.add("Emmy");
        set2.add("Rosa");
        set2.add("Boyl");

        System.out.println(union (set1, set2));
        System.out.println(intersect (set1, set2));
    }
}
