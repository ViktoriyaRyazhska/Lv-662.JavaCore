package hw6;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Whoowgh");
    }

    @Override
    public void feed() {
        System.out.println("Meet");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
