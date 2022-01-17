package Task_5Praktice.Line;

import java.util.Arrays;

public class AppLine {
    public static void main(String[] args) {
        Line line1 = new Line();
        Line line2 = new ColorLine("Blue");
        Line line3 = new Line();
        Line line4 = new ColorLine("Red");

        Line [] arrOfLines = new Line[]{line1,line2,line3,line4};
        System.out.println(Arrays.toString(arrOfLines));
    }
}
