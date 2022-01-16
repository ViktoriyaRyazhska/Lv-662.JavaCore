package lesson_5_CW;

public class Appl {

    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Truck();
        cars[0].setModel("mazda");
        cars[0].setMaxSpeed(250);
        cars[0].setYearOfManufacture(2005);
        cars[1] = new Truck();
        cars[1].setModel("Ford");
        cars[1].setMaxSpeed(180);
        cars[1].setYearOfManufacture(2010);
        cars[2] = new Sedan();
        cars[2].setModel("lexus");
        cars[2].setMaxSpeed(280);
        cars[2].setYearOfManufacture(2020);
        cars[3] = new Sedan();
        cars[3].setModel("bmw");
        cars[3].setMaxSpeed(310);
        cars[3].setYearOfManufacture(2021);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].run());
            System.out.println(cars[i].stop());
        }
    }
}
