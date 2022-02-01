package prTask5p2;

public class Appl {
    public static void main(String[] args) {

        Point p1 = new Point(2,4);
        Point p2 = new Point(3, 4);


        Line[] line = new Line[3];
        line[0] = new Line(p1,p2);
        line[1] = new Line(p2,p1);
        line[2] = new ColorLine(p1,p2, "red");

        for (Line linei : line) {
            System.out.println(linei.print());

        }

    }
}
