package hw2.hw5;

public class ColorLine extends Line {

    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }

    public String print() {
        return super.print() + ", color: " + color;
    }
}