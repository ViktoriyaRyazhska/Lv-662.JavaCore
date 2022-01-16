package lesson_5_CW_2;

public class ColorLine extends Line {
   private String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public ColorLine(int x, int y, String color) {
        super (x, y);
        Color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "Color='" + Color + '\'' +
                '}';
    }

    public void print() {
        System.out.println("This is Line with color " + getColor());
    }
}
