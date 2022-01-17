package Task_5Praktice.Line;

public class ColorLine extends Line{

    //fields
    private String Color;

    Point p3 = new Point(6,6);
    Point p4 = new Point(6,0);

    //constructors

    public ColorLine(String color) {
        this.Color = Color;
    }

    //methods

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = Color;
    }

    @Override
    public String toString(){
        return " p1 = " + p1 + " p2 = " + p2 + " Color = " + Color ;
    }


}
