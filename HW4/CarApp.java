package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarApp {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car c = new Car();

        Car c1 = new Car("sedan", 2010,1.3);
        Car c2 = new Car("sedan", 2011,1.4);
        Car c3 = new Car("suv", 2012,1.7);
        Car c4 = new Car("minivan", 2009,1.2);
        Car c5 = new Car("pickup", 2018,1.8);

        System.out.println("Enter year of production");

        Car arr[] = new Car[5];
        arr[0] = c1; arr[1]=c2; arr[2] = c3; arr[3] = c4; arr[4] = c5;

        int y = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getYearOfProd() == y) System.out.println(arr[i]);
        }

        System.out.println("All cars sorting by year of production");



        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
            if(arr[i].getYearOfProd()<arr[j].getYearOfProd()){
                c = arr[i];
                arr[i] = arr[j];
                arr[j]=c;
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
