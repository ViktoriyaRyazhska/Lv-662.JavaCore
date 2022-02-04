package HW10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberApp {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers");
        double a = 0;
        double b = 0;
        try{
            a = Double.parseDouble(br.readLine());
            b = Double.parseDouble(br.readLine());
        }catch (IOException e){
            System.out.println("You did not enter a number");
        }catch (NumberFormatException e){
            System.out.println("You did not enter a number");
            System.exit(1);
        }
        try {
            div(a, b);
        }catch (ArithmeticException e){
            System.out.println("Division by zero is impossible");
        }
    }
    public static void div(Double a, Double b)throws ArithmeticException{
            if (b != 0) {
                System.out.println("Division of two numbers = " + a / b);
            }
        else{
            throw new ArithmeticException();
        }

    }
}
