package hw10.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static int readNumber(int start, int end) throws IOException, RangeException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        if (number < start | number > end)
            throw new RangeException("Number out of range");
        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Please enter a number in from range " + start + " to " + end);
                System.out.println(readNumber(start, end));
            } catch (RangeException | NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
