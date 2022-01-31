package L10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practical {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = "IT";
		String b = "IT Academy";
		
		System.out.println(b.contains(a));

		
		String fn = "Antonenko Halyna Petrivna";
		String[] arr = fn.split(" ");
		for (String w: arr) {
//		System.out.println(w);
		}
		System.out.println(arr[0] + " " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".");
		System.out.println(arr[1]);
		System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
		
		
		System.out.println("Please, enter your name: ");
		String name = br.readLine();
		
//		String pattern = "^[a-zA-z0-9_]{3,15}$";
		String pattern = "\\w{2,15}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);
		
		if (m.matches()) {
			System.out.println("Yout name was accepted!");
		} else {
			System.out.println("Invalid name! Your name should contains from 3 to 15 characters of the Latin alphabet, "
					+ "numbers and underscores");
		}
		
	}
}
