package Task_10Praktice.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rectangleArea {
    public static int squareRectangle(int a , int b){
        if (b < 0 | a < 0){
            throw new ArithmeticException();
        }
            return a * b ;
    }
}
