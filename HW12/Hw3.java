package java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hw3 {

	public static void main(String[] args) {

		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate l = LocalDate.now();
		String d = f.format(l);
		System.out.println(d);
		
	}

}