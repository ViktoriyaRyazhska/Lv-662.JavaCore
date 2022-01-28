package hw4p3;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
   private final String type;
   private int yearProduction;
   private final double engineCapacity;


   public Car(String type, int yearProduction, double engineCapacity) {
       this.type = type;
       this.yearProduction = yearProduction;
       this.engineCapacity = engineCapacity;
   }

  public int getYearProduction() {
     return this.yearProduction;
  }

    public double getEngineCapacity() {
        return engineCapacity;
    }


    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter year of production");
        this.yearProduction = Integer.parseInt(br.readLine());
        System.out.println("Car model of this year is " + type);

    }

}