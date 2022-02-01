package Task_10HM.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task4_4_CarException {

   //fields

    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    //constructors

    public task4_4_CarException(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    //methods

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] yearOfProduction = new int[4];
            for (int i = 0; i < yearOfProduction.length; i++) {
                System.out.println("pleas enter year of production " + (i + 1) + " car");
                yearOfProduction[i] = Integer.parseInt(br.readLine());
            }

            task4_4_CarException[] cars = new task4_4_CarException[4];
            cars[0] = new task4_4_CarException("Sedan", yearOfProduction[0], 1.8);
            cars[1] = new task4_4_CarException("Sports Car", yearOfProduction[1], 2.2);
            cars[2] = new task4_4_CarException("Hatback", yearOfProduction[2], 3.0);
            cars[3] = new task4_4_CarException("Minsvan", yearOfProduction[3], 1.9);

            task4_4_CarException n;
            for (int i = 0; i < cars.length - 1; i++) {
                for (int j = i + 1; j < cars.length; j++) {
                    if (cars[i].getYearOfProduction() > cars[i + 1].getYearOfProduction()) {
                        n = cars[i];
                        cars[i] = cars[i + 1];
                        cars[i + 1] = n;
                    }
                }
            }
            System.out.println(Arrays.toString(yearOfProduction));
        }catch (NumberFormatException e){
            System.err.println(" Wrong enter format pleas try again ");
        }catch (Exception e){
            System.err.println(" Exception : " + e.getMessage());
        }
    }
}
