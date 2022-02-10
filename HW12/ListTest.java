package HW12;
//1. There is a list of strings list1. Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)
//2. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//Method encrypt should take a string and return coded string where every letter is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value
//3. Create method to validate date according to format "mm.dd.yy"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Anton", "Sergiy", "Ruslan", "Max"));
        System.out.println("First list");
        list1.stream().forEach(System.out::println);

        list1.removeIf(s -> s.length() > 5);
        List<String> list2 = new ArrayList<>(list1);
        System.out.println("Second list");
        list2.stream().forEach(System.out::println);
    }
}
