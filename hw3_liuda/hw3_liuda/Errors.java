package hw3_liuda;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Errors {
    NOT_FOUND, UNAUTHORIZED, PAYMENT_REQUIRED;

    public static void main(String[] args) throws IOException {

        System.out.println("Enter error numbers 404, 401, 402");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int error = Integer.parseInt(br.readLine());

        switch (error) {
            case 404:
                System.out.println(Errors.NOT_FOUND);
                break;
            case 401:
                System.out.println(Errors.UNAUTHORIZED);
                break;
            case 402:
                System.out.println(Errors.PAYMENT_REQUIRED);
                break;
            default:
                System.out.println("Wrong number of error");
        }
    }
}



