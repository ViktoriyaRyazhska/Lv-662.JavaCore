package lesson_5_CW_2;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[2];
        Point line1 = new Point(3, 6);
        Point line2 = new Point(2, 9);

        lines[0] = new Line(line1, line2);
        lines[1] = new ColorLine(line1, line2, "yellow");
        //lines[0] = new Line(new Point(3,4), new Point(3,5));

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i].print());

        }


    }
}
