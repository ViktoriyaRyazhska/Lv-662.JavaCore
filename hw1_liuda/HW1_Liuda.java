package P1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW1_Liuda {
    public static void main(String[] args) throws IOException {
//        task 1
        int r = 3;
        double pi = 3.14;
        double perimeter;
        perimeter = 2*pi*r;
        double area;
        area = pi*r*r;
        System.out.println("Perimeter of Flower bed = " + perimeter + " meters");
        System.out.println("Area of Flower bed is " + area + " meters");

//        task 2

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name1 = br1.readLine();
        System.out.println("Where do you live, " + name1 + "?");


//        task 3

        double c1;
        double c2;
        double c3;
        c1 = 2;
        c2 = 4;
        c3 = 10;

        double t1 = 5;
        double t2 = 3;
        double t3 = 1;

        double sep1 = c1*t1;
        double sep2 = c2*t2;
        double sep3 = c3*t3;

        double all = sep1 + sep2 + sep3;
        double all2 = c1*t1 + c2*t2 + c3*t3;

        System.out.println(all);
        System.out.println(all2);


    }
}
