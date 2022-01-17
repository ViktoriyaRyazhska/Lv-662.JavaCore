package Task_5Praktice.Car;

public class CarApp {


    public  static void main(String[] args) {
        task5_1_abstractClass[] arrayOfCars = new task5_1_abstractClass[6];
        arrayOfCars[0] = new Trucks("BMV",50,2010);
        arrayOfCars[1] = new Trucks("Mercedes", 70,2012);
        arrayOfCars[2] = new Trucks("MAN",60,2015);
        arrayOfCars[3] = new Sedan("Reno",250,2014);
        arrayOfCars[4] = new Sedan("Mazda",260,2017);
        arrayOfCars[5] = new Sedan("Porsche",310,2020);
        for(int i = 0; i < arrayOfCars.length;i++) {
            System.out.println((i+1) + " car");
            System.out.println(arrayOfCars[i].getModel());
            System.out.println(arrayOfCars[i].getMaxSpeed());
            System.out.println(arrayOfCars[i].getYearOfManufacture_properties());

        }
    }
}
