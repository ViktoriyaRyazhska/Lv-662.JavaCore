package hw7_p1;

public class Student extends Person{

    private int field;

    public Student(FullName fullName, int age, int field) {
        super(fullName, age);
        this.field = field;
    }

    @Override
    public String info(){
        return "First name: " + fullName.getFirstName() + "; Last name: " + fullName.getLastName() + "; Age: " + getAge();

    }

    @Override
    public String activity() {
        return "I am a student";
    }
}
