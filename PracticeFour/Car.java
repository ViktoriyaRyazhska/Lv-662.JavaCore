package PracticeFour;

import java.util.Arrays;

abstract public class Car {
    String model;
    int maxSpeed;
    int yearOfManufacture;

    public abstract String getModel();

    public abstract void setModel(String model);

    public abstract int getMaxSpeed();


    public abstract void setMaxSpeed(int maxSpeed);


    public abstract int getYearOfManufacture();


    public abstract void setYearOfManufacture(int yearOfManufacture);

}
 class CarApp {


     public static void main(String[] args) {
         Car []arr = new Car[3];

         Car c1 = new Sedan();
         c1.setModel("BMW");
         c1.setMaxSpeed(100);
         c1.setYearOfManufacture(2012);
         arr[0] = c1;


         Car c2 = new Truck();
         c2.setModel("Ford");
         c2.setMaxSpeed(90);
         c2.setYearOfManufacture(2014);
         arr[1] = c2;

         Car c3 = new Sedan();
         c3.setModel("Volvo");
         c3.setMaxSpeed(95);
         c3.setYearOfManufacture(2015);
         arr[2] = c3;

         System.out.println(Arrays.toString(arr));
     }
}
