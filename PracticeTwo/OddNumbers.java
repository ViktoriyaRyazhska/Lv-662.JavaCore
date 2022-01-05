package PracticeTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNumbers {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter three numbers ");
            Integer a = Integer.parseInt(br.readLine());
            Integer b = Integer.parseInt(br.readLine());
            Integer c = Integer.parseInt(br.readLine());

            int  count = 0;
            int x = 0;

            count = (a % 2==0)? x++:x;
            count = (b % 2==0)? x++:x;
            count = (c % 2==0)? x++:x;

            System.out.println("There are : " + x + " odd numbers");

        }
}
