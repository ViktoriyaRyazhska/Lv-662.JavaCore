package hw12.homework;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> list1 = new LinkedList<>(List.of(
				"The Java Virtual Machine is only one part of Java software that is involved in running an application"
						.split(" ")));
		list1.removeIf(string -> string.length() > 5);
		List<String> list2 = new LinkedList<>(list1);
		System.out.println(list2);
		System.out.println();
		System.out.println(decrypt(encrypt("abc", 3), 3));
		System.out.println();
		System.out.println(isValidDate("12.24.86"));
	}

	static String encrypt(String s, int n) {

		return s.chars().mapToObj(c -> (char) (c + n)).map(String::valueOf).collect(Collectors.joining());

	}

	static String decrypt(String s, int n) {

		return encrypt(s, -n);

	}

	static boolean isValidDate(String date) {

		try {
			DateTimeFormatter.ofPattern("mm.dd.yy").parse(date);
		} catch (DateTimeParseException e) {
			return false;
		}

		return true;

	}

}
