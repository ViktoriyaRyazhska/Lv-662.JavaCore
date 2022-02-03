package hw10.practical1;

public class Rectangle {
    public static int squareRectangle (int a, int b) {
        if (a <= 0 | b <= 0)
            throw new ArithmeticException();
        return a * b;
    }
}
