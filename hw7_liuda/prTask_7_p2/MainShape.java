package prTask_7_p2;

public class MainShape {
    public static void main(String[] args) {

        Wrapper<Shape> squareWrapper = new Wrapper<>(new Square(4, "green"));
        Wrapper<Circle> circleWrapper = new Wrapper<>(new Circle(8, "pink"));

        System.out.println(squareWrapper);
        System.out.println(circleWrapper);

       // Wrapper<String> stringWrapper = new Wrapper<String>("Hello!");

    }
}
