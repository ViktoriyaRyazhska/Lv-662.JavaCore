package lesson_8.ClassWork2;

public class Square implements Shape{

    private int lineLength;
    private String shade;

    public Square(int lineLength, String shade) {
        this.lineLength = lineLength;
        this.shade = shade;
    }

    @Override
    public String toString() {
        return "Square - " +
                "lineLength=" + lineLength +
                ", shade=" + shade;
    }
}
