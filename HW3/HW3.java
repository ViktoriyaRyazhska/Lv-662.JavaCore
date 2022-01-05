package HW3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HW3 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 float number ");
        float x = Float.parseFloat(br.readLine());
        float y = Float.parseFloat(br.readLine());
        float z = Float.parseFloat(br.readLine());

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
