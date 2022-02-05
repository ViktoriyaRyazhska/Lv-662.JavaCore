package hw10.practical2;

import java.util.Arrays;

public class PlantApp {
    public static void main(String[] args) {


        try {
            Plant[] plant = new Plant[5];
            plant[0] = new Plant(4, "red", "fruit");
            plant[1] = new Plant(3, "blue", "flower");
            plant[2] = new Plant(2, "yellow", "herb");
            plant[3] = new Plant(1, "green", "tree");
            plant[4] = new Plant(5, "red", "vegetable");

            for (Plant p : plant) {
                System.out.println(p);
            }

        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
