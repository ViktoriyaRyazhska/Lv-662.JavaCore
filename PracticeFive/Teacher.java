package PracticeFive;

public class Teacher extends Staff{

    static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println( "This is - " + TYPE_PERSON + " His name is : " + name);

    }

    @Override
    void salary() {
        System.out.println("Teacher salary is : 9000 " );

    }
}
