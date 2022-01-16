package java17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CarApp {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Car c = new Car();

        Car c1 = new Car("универсал", 2020,1.3);
        Car c2 = new Car("кабриолет", 2003,2.1);
        Car c3 = new Car("минивэн", 2011,2.0);
        Car c4 = new Car("седан", 2015,1.2);
        Car c5 = new Car("фургон", 2019,1.6);

        System.out.println("Напишите год выпуска автомобиля ");

        Car arr[] = new Car[5];
        arr[0] = c1; arr[1]=c2; arr[2] = c3; arr[3] = c4; arr[4] = c5;

        int y = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getYear() == y) System.out.println(arr[i]);
        }

        System.out.println("Все автомобили в порядке убывания : ");



        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
            if(arr[i].getYear()<arr[j].getYear()){
                c = arr[i];
                arr[i] = arr[j];
                arr[j]=c;
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
