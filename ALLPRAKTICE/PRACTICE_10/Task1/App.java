package Task_10Praktice.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(rectangleArea.squareRectangle(a, b));
        }catch (ArithmeticException e){
            System.err.println(" You cant enter negative number ");
            System.exit(0);
        }catch(NumberFormatException e){
            System.err.println(" Entered value i`snt a number ");
            System.exit(0);
        }catch (IOException e){
            System.err.println(" Error : " + e.getMessage());
            System.exit(0);
        }
    }
}