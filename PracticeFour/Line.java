package PracticeFour;

import java.util.Arrays;

public class Line {

    Point p1 = new Point(1,2);
    Point p2 = new Point(2,4);

    @Override
    public String toString(){
        return "[" + " Line have points :" + p1 + " and " + p2 + " ]";
    }
}
 class LineApp{
    public static void main(String[] args) {
        Line l = new Line();
        Line l1 = new ColorLIne("Red");
        Line l2 = new Line();
        Line l3 = new ColorLIne("Green");

        Line arr[] = new Line[4];
        arr[0] = l; arr[1] =l1; arr[2] = l2; arr[3] = l3;

        System.out.println(Arrays.toString(arr));
    }
}
