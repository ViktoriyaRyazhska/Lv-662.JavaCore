package hw7_p1;

public abstract class Person {

    FullName fullName;
    private int age;

    public int getAge(){
        return age;
    }

    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name: " + fullName.getFirstName() + " Last name: " + fullName.getLastName() + " Age: " + getAge();
    }

    public abstract String activity();
}
