package PracticeFive;

public class Dog implements Animal{


    @Override
    public void voice() {
        System.out.println("Dog voice : woof ");

    }

    @Override
    public void feed() {
        System.out.println("Dog after feed is happy");
    }
}
