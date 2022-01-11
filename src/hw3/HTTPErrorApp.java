package hw3;

import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPErrorApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter http error code: ");
        int httpcode = Integer.parseInt(br.readLine());

        HTTPError httpError = HTTPError.NOT_FOUND;

        switch (httpcode) {
            case 400:
                System.out.printf("Http error response: ");
                httpError = HTTPError.BAD_REQUEST; break;
            case 401:
                System.out.printf("Http error response: ");
                httpError = HTTPError.UNAUTHORIZED; break;
            case 402:
                System.out.printf("Http error response: ");
                httpError = HTTPError.PAYMENT_REQUIRED; break;
            case 403:
                System.out.printf("Http error response: ");
                httpError = HTTPError.FORBIDDEN; break;
            case 404:
                System.out.printf("Http error response: ");
                httpError = HTTPError.NOT_FOUND; break;
            default:
                System.out.println("\nNo such error code in database");
                System.exit(0);
        }
        System.out.println(httpError);
    }
}
