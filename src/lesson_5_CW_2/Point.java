package lesson_5_CW_2;

import org.w3c.dom.ls.LSOutput;

public class Point {
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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }


    public void print() {
        System.out.println("Point x = " + getX() + " point y = " + getY());
    }

}
