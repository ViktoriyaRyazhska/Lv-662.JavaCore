package prTask5p1;

public class Appl {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Truck("Mercedes-Benz", 240, 2019);
        cars[1] = new Sedan("Ford_Fiesta", 180, 2017);
        cars[2] = new Truck("Volkswagen", 220,2014);
        cars[3] = new Sedan("BMW", 190, 2012);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }

}
