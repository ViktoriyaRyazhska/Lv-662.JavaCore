package Task_10HM.Task2;

import java.util.Scanner;

public class task1Exception {
    public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas enter variable a");
        double a = sc.nextInt();
        System.out.println("Pleas enter variable b");
        double b = sc.nextInt();
        if(b==0)throw new ArithmeticException();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }catch (ArithmeticException e){
        System.err.println(" Dividing by zero ");
    }catch(Exception e ){
        System.err.println(" Enter variable is not a number  " );
    }
    }
}
