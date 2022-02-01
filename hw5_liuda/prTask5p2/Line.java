package prTask5p2;

public class Line {
    private final Point point1;
    private final Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString(){
        return "Line point 1 " + point1 + ", Line point 2 " + point2;
    }

    public String print(){
        return "Line  " + point1.print() + ", " + point2.print();
    }


}
