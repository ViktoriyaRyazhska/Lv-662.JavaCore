package lesson_5_CW;

public class Appl {

    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Truck("mazda", 250, 2005);
        cars[1] = new Truck("ford", 180, 2010);
        cars[2] = new Sedan("lexus", 280, 2020, 5, 6, 210);
        cars[3] = new Sedan("bmw", 301, 2021, 4, 30, 200);


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            System.out.println(cars[i].run());

        }


    }
}
