package L10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw_task3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please, write any double number: ");
		String number = br.readLine();
	
		String pattern = "(\\d*)\\.+(\\d{2})?+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(number);
		while (m.find() ) {
			System.out.println("$" + number.substring(m.start(), m.end()));
		}
		
//		String s1 = String .format("%s %.2f", "$", 345.6779465);
//		System.out.println(s1);
//		
//		String s2 = String .format("%s %.2f", "$", 83208.45689);
//		System.out.println(s2);
//		
//		String s3 = String .format("%s %.2f", "$", 13.1240000);
//		System.out.println(s3);
//		
//		String s4 = String .format("%s %.2f", "$", 8077.8562);
//		System.out.println(s4);
//		
//		String s5 = String .format("%s %.2f", "$", 1.48687);
//		System.out.println(s5);
	}

}
