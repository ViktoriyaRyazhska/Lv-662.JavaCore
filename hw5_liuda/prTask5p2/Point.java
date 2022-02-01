package prTask5p2;

public class Point {
    private final int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point x = " + x + ", " + "Point y = " + y;
    }

    public String print(){
        return "[x = " + x + " y = " + y + "] ";
    }
}
