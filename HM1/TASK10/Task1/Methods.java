package Task_10HM.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {

    public static void div(double d1, double d2) {
        try {
            double d3 = d1 / d2;
        } catch (NumberFormatException e) {
            System.err.println("The enter value is not a number");
        } catch (Exception e) {
            System.err.println("Error");
        } finally {
            System.out.println(d1 / d2);
        }

    }

    public static int readNumber(int start, int end) throws NumberFormatException , ArithmeticException , IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (x < end && x > start) {
        } else if (x > end | x < start){
           throw new ArithmeticException();
        }else{
            throw new NumberFormatException();
        }
        return x;
    }
}


