package prTask_7_p2;

public class Circle implements Shape{
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Circle has radius " + radius + " and " + color + " color.";
    }
}
