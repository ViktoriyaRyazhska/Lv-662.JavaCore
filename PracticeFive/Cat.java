package PracticeFive;

public class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("Cat voice : meow");

    }

    @Override
    public void feed() {
        System.out.println("Cat after feed : mrrrrr");

    }
}
