package lesson_5_CW_2;

public class ColorLine extends Line {
    private String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        Color = color;
    }


    @Override
    public String toString() {
        return "ColorLine{" +
                "Color='" + Color + '\'' +
                '}';
    }

    public String print() {
        return super.print() + " + color of this line is " + Color;
    }


}