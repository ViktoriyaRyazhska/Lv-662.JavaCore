package lesson_8.ClassWork2;

public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square - " +
                "lineLength=" + radius +
                ", shade=" + color;
    }
}
