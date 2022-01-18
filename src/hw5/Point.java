package hw2.hw5;

class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public String print() {
        return "[" +
                "x=" + x +
                ",y=" + y +
                ']';
    }
}
