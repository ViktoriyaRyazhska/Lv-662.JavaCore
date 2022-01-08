package Task_4HM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task4_4_Car {

   //fields

    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    //constructors

    public task4_4_Car(String type, int yearOfProduction, double engineCapacity) {
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] yearOfProduction = new int[4];
        for (int i =0;i < yearOfProduction.length; i++){
            System.out.println("pleas enter year of production " + (i+1) + " car");
            yearOfProduction[i]=Integer.parseInt(br.readLine());
        }

        task4_4_Car car1 = new task4_4_Car("Sedan",yearOfProduction[0],1.8);
        task4_4_Car car2 = new task4_4_Car("Sports Car",yearOfProduction[1],2.2);
        task4_4_Car car3 = new task4_4_Car("Hatback",yearOfProduction[2],3.0);
        task4_4_Car car4 = new task4_4_Car("Minsvan",yearOfProduction[3],1.9);

        int n = 0;
        for (int i = 0; i < yearOfProduction.length-1;i++){
            for (int j =i + 1 ; j < yearOfProduction.length;j++){
                if(yearOfProduction[i]>yearOfProduction[i+1]){
                    n = yearOfProduction[i];
                    yearOfProduction[i] = yearOfProduction[i+1];
                    yearOfProduction[i+1] = n;
                }
            }
        }
        System.out.println(Arrays.toString(yearOfProduction) );
    }
}
