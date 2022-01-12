package l4HW;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1C {

	public enum HTTPError {
		BAD_REQUEST, UNAUTHORIZED, FORBIDDEN, NOT_FOUND

	}

	// The error codes included are 400, 401, 403, and 404
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter the HTTP Error code (400, 401, 403 or 404):");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int code = Integer.parseInt(br.readLine());

		switch (code) {
		case 400:
			System.out.print(HTTPError.BAD_REQUEST);
			break;
		case 401:
			System.out.print(HTTPError.UNAUTHORIZED);
			break;
		case 403:
			System.out.print(HTTPError.FORBIDDEN);
			break;
		case 404:
			System.out.print(HTTPError.NOT_FOUND);
			break;
		default:
			System.out.print("Error code not found");
		}

	}

}
