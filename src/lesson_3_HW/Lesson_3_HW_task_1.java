package lesson_3_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Lesson_3_HW_task_1 {
	
	public enum HTTP {
		Bad_request, Unauthorized, Payment_Required
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the float number 1");
		double a = Double.parseDouble(br.readLine());
		System.out.println("Please enter the float number 2");
		double b = Double.parseDouble(br.readLine());
		System.out.println("Please enter the float number 3");
		double c = Double.parseDouble(br.readLine());

		if (a >= -5 & a <= 5 & b >= -5 & b <= 5 & c >= -5 & c <= 5) {
			System.out.println("Numbers belong to the range [-5,5]");
		} else {
			System.out.println("Numbers do NOT belong to the range [-5,5] ");
		}

//		// task1.1
		
		double d = Math.min(a, b);
		double e = Math.min(a, c);
		
		System.out.println(Math.min(d, e) + " is the min value");
		
		double f = Math.max(a, b);
		double g = Math.max(a, c);
		
		System.out.println(Math.max(f, g) + " is the max value");
//		
//		// task1.2
//		
		System.out.println("Please enter the status code");
		String t=br.readLine();
		 
	
		HTTP code = HTTP.Bad_request;
		
		switch (t) {
		case "400":
			code = HTTP.Bad_request; break;
		case "401": 
			code = HTTP.Unauthorized; break;
		case "402":
			code = HTTP.Payment_Required; break;
		
		
		default:
			System.out.println("No this code");
			System.exit(0);
		}
		System.out.println(code);
		
		// task1.3
		
//		int n = 5, s = 4, v = 7;
//		System.out.println(n > s && n > v || s < v);
//		System.out.println((n < v || s > v) && n < s);

		
	}
}
