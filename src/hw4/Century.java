package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Century {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer y = Integer.parseInt(br.readLine());
        int test = centuryFromYear(y);
        System.out.println(test);

    }

    static int centuryFromYear(int year) {
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        return year;
    }
}
