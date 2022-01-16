package PracticeFour;

public class ColorLIne extends Line{
  private   String color;

    Point p1 = new Point(3,5);

    public ColorLIne(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "[" + " Color Line have point " + p1 + " and color " + color + " ]";
    }
}
