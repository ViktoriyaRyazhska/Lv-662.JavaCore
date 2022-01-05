package Task_3HM;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) throws IOException {

        // (Section 1) read 3 float numbers and check are they belong to the range [-5..5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 float  number ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        if (x <= 5 && x >= -5) {
            System.out.println("variable x belong to the range [-5..5]");
        } else {
            System.out.println("variable x does not belong to the range [-5..5]");
        }

        if (y <= 5 && y >= -5) {
            System.out.println("variable y belong to the range [-5..5]");
        } else {
            System.out.println("variable y does not belong to the range [-5..5]");
        }

        if (z <= 5 && z >= -5) {
            System.out.println("variable z belong to the range [-5..5]");
        } else {
            System.out.println("variable z does not belong to the range [-5..5]");
        }

        //(Section 2) read 3 integer numbers and write max and min of them;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 Integer number ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a > b && a > c) System.out.println(" a is max variable");
        else if (b > a && b > c) System.out.println(" b is max variable");
        else System.out.println(" c is max variable");

        if (a < b && a < c) System.out.println(" a is min variable");
        else if (b < a && b < c) System.out.println(" b is min variable");
        else System.out.println(" c is min variable");


    }
}


