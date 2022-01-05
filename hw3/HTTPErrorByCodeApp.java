package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPErrorByCodeApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter HTTP error code: ");
		int code = Integer.parseInt(br.readLine());
		HTTPError error = null;
		
		switch (code) {
		case 400:
			error = HTTPError.ERROR400;
			break;
		case 401:
			error = HTTPError.ERROR401;
			break;
		case 402:
			error = HTTPError.ERROR402;
			break;
		case 403:
			error = HTTPError.ERROR403;
			break;
		case 404:
			error = HTTPError.ERROR404;
			break;
		default:
			System.out.println("Unknown error");
			System.exit(0);
		}
		System.out.println(error.getName());
	}
}
