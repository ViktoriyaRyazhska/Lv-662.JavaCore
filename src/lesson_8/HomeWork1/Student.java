package lesson_8.HomeWork1;

public class Student extends Person{

    private int field;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public Student(FullName fullName, int age, int field) {
        super(fullName, age);
        this.field = field;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return "First name: " + getFullName().getFirstName() + ", Last name: " + getFullName().getLastName()
                + ", Age: " + getAge() + ", Field: " + getField();
    }
}
