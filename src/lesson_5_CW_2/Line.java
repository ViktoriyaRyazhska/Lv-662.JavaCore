package lesson_5_CW_2;

public class Line {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Point p1 = new Point(4, 5);
    Point p2 = new Point(6, 5);

    public Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Line{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println("This is line and x = " + getX() + " y = " + getY());
    }
}


