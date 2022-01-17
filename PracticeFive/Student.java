package PracticeFive;

public class Student extends Person{

    static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }


    @Override
    void print() {
        System.out.println( "This is - " + TYPE_PERSON +  " His name is : " + name);
    }
}
