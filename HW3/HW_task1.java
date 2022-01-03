package l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_task1 {
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
// read 3 float numbers and check: are they all belong to the range [-5,5];
		
		System.out.println("Enter the first float number");
		float a = Float.parseFloat(br.readLine());
		
		System.out.println("Enter the second float number");
		float b = Float.parseFloat(br.readLine());
		
		System.out.println("Enter the third float number");
		float c = Float.parseFloat(br.readLine());
		
		
		if (a >= -5 & a <=5 & b >= -5 & b <=5 & c >= -5 & c <=5) {
			System.out.println("All the numbers belong to the range [-5,5]");
		} else if (a >= -5 & a <=5 & b >= -5 & b <=5) {
			System.out.println("Only " + a + " and " + b + " belong to the range [-5, 5]");
		} else if (c >= -5 & c <=5 & b >= -5 & b <=5) {
			System.out.println("Only " + b + " and " + c + " belong to the range [-5, 5]");
		} else if (a >= -5 & a <=5 & c >= -5 & c <=5) {
			System.out.println("Only " + a + " and " + c + " belong to the range [-5, 5]");
		} else if (a >= -5 & a <= 5) {
			System.out.println("Only " + a + "number " + " belongs to the range [-5,5]");
		} else if (b >= -5 & b <= 5) {
			System.out.println("Only " + b + "number " + " belongs to the range [-5,5]");
		} else if (c >= -5 & c <= 5) {
			System.out.println("Only " + c + "number " + " belongs to the range [-5,5]");
		} else {
			System.out.println("ONone of numbers belong to the range [-5,5]");
		}
		

		
// read 3 integer numbers and write max and min of them;
		
		System.out.println("Enter the first number");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the second number");
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the third number");
		int z = Integer.parseInt(br.readLine());
		
		if (x >= y & x >= z) {
			System.out.println("The biggest number is " + x);
		}
		if (y >= x & y >= z) {
			System.out.println("The biggest number is " + y);
		}
		if (z >=x & z >= y) {
			System.out.println("The biggest number is " + z);
		}
		
		if (x <= y & x <= z) {
			System.out.println("The smallest number is " + x);
		}
		if (y <= x & y <= z) {
			System.out.println("The smallest  number is " + y);
		}
		if (z <=x & z <= y) {
			System.out.println("The smallest number is " + z);
		}
	
	
	//	read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
	
	    System.out.println("Enter the error number");
	    int errorNumber = Integer.parseInt(br.readLine());
	    
	    enum HTTPError {
	    	BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND
	    }
	    
	    HTTPError httperror = null;
		
		switch (errorNumber) {
		case 400:
		httperror = HTTPError.BAD_REQUEST; break;
		case 401:
		httperror = HTTPError.UNAUTHORIZED; break;
		case 402:
		httperror = HTTPError.PAYMENT_REQUIRED; break;
		case 403:
		httperror = HTTPError.FORBIDDEN; break;
		case 404:
		httperror = HTTPError.NOT_FOUND; break;
		default:
		System.out.println("Unknown mistake!");
		System.exit(0);
		}
	
	    System.out.println(httperror);
	
	}
}
