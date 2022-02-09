package Lecture13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTask {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("red", "blue", "pink", "white", "gray", "black", "green", "yellow");
		List<String> list2 = list1.stream()
				.filter(word -> word.length() <= 5)
				.collect(Collectors.toList());
		System.out.println(list2);
		
		List<String> list3 = list1
				.stream()
				.collect(Collectors.toList());
		list3.removeIf(word -> word.length() <= 5);
		System.out.println(list2);
		
//		There is a list of strings list1. Create a new list list2 that has items from 
//		list1 and length less than 5 characters (use method removeIf)
		
	}

}
