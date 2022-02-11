package Lecture13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
//		LocalDate now = LocalDate.now();
//		DateTimeFormatter americanDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//		String americanDate = now.format(americanDateFormat);
//		System.out.println("USA date format : " + americanDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String dateString = formatter.format(localDate);
		System.out.println(dateString);
		
	}

}

//Create method to validate date according to format "mm.dd.yy"