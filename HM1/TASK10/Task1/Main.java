package Task_10HM.Task1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Create method div(), which calculates the dividing of two double numbers. In main method input 2 double numbers and call this method. Catch all exceptions.
//Write a method readNumber(int start, int end), that read from console integer number and return it, if it is in the range [start...end].
//If an invalid number or non-number text is read, the method should throw an exception.
//Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
//Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.

public class Main {
    public static void main(String[] args) {

        double d1 = 17.3;
        double d2 = 4.2;
        Methods.div(d1,d2);

        System.out.println(" Pleas enter 10 integer value ");
        List<Integer> number = new LinkedList<>();
        for (int i = 0 ; i < 10 ; i++) {
            try {
                int start = 0;
                int end = 100;
                number.add(Methods.readNumber(start, end));
            } catch (NumberFormatException e) {
                System.err.println(" Entered variable not a number ");
                i--;
            } catch (ArithmeticException e) {
                System.err.println(" Entered variable is not in the range ");
                i--;
            } catch (IOException e) {
                System.err.println(" Error ");
                i--;
            }
        }
        Collections.sort(number);
        System.out.println(number);
    }
}

