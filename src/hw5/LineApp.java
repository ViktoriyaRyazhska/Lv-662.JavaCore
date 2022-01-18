package hw2.hw5;

public class LineApp {
    public static void main(String[] args) {
        Line[] line = new Line[4];

        Point p1 = new Point(5,6);
        Point p2 = new Point(4,5);
        Point p3 = new Point(6,9);

        line[0] = new Line(p1,p2);
        line[1] = new Line(p2,p1);
        line[2] = new ColorLine(p3,p2,"red");
        line[3] = new ColorLine(p1,p3,"green");

        for (Line i : line) {
            System.out.println(i.print());
        }

    }
}
