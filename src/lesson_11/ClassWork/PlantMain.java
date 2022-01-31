package lesson_11.ClassWork;

public class PlantMain {

    public static void main(String[] args) {
        Plant[] plants = new Plant[2];
        try {
        plants[0] = new Plant("Blue", "long", 8);
        } catch (ColorException | TypeException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            plants[1] = new Plant("Red", "high", 5);
        } catch (ColorException | TypeException exception) {
            System.out.println(exception.getMessage());
        }



    }
}
