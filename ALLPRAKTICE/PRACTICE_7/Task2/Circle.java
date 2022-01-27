package Task_7Praktice.Task2;

public class Circle<T> implements Shape{

    String color;
    int starPoint;
    private T t;

    public Circle(String color, int starPoint) {
        this.color = color;
        this.starPoint = starPoint;
    }
    public void set (T t){this.t = t;}
    public T get(){return t;}
    @Override
    public int startCordinate() {
        return starPoint;
    }

    @Override
    public String color() {
        return color;
    }

    Circle ci1 = new Circle("White",0);
}
