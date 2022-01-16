package lesson_5_CW_2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(3, 4);
        lines[1] = new ColorLine(4,5,"red");
        lines[2] = new ColorLine(3, 7, "yellow");

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);

        }

    }
}
