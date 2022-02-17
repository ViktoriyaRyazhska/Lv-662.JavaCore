package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hw1 {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("кошка", "собака", "попугай", "крыса", "хомяк", "змея", "рыбки");
		List<String> list2 = list1.stream()
				.collect(Collectors.toList());
		list2.removeIf(word -> word.length() > 5);
		System.out.println(list1);
		System.out.println(list2);
		
	}

}