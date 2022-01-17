package PracticeFive;

public class Cleaner extends Staff{

     static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }


    @Override
    void print() {
        System.out.println( "This is - " + TYPE_PERSON + " His name is : " + name);
    }

    @Override
    void salary() {
        System.out.println("Cleaner salary is 8500" );
    }

}
