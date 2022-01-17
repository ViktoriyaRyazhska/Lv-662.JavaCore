package Task_5Praktice.Line;

public class Point {

    //fields
    private int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return " x = " + x  + " y = " + y;
    }


}
