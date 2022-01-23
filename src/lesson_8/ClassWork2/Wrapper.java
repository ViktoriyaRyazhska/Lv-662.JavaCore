package lesson_8.ClassWork2;

public class Wrapper <T extends Shape> {

    T shape;

    public Wrapper(T shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Wrapper : " +
                "shape :  " + shape;
    }
}
