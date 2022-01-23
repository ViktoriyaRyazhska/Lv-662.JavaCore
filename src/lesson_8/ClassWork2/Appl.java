package lesson_8.ClassWork2;

public class Appl {

    public static void main(String[] args) {

    Wrapper<Shape> squareWrapper = new Wrapper<>(new Square(5, "Yellow"));
    Wrapper<Shape> circleWrapper = new Wrapper<>(new Circle(8, "Yellow"));

        System.out.println(squareWrapper.toString());
        System.out.println(circleWrapper.toString());
    }

}
