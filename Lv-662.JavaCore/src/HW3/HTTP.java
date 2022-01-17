package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)

public class HTTP {
	public enum HTTPError {
		BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of your error:\t");

		HTTPError error = null;

		int input = Integer.parseInt(br.readLine());
		switch (input) {
		case 400:
			error = HTTPError.BAD_REQUEST;
			break;
		case 401:
			error = HTTPError.UNAUTHORIZED;
			break;
		case 402:
			error = HTTPError.PAYMENT_REQUIRED;
			break;
		case 403:
			error = HTTPError.FORBIDDEN;
			break;
		default:
			System.out.println("Another option of errors");

		}
		System.out.println("Cause of your error is:\t" + error);

	}

}
