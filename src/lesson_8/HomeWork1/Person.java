package lesson_8.HomeWork1;

abstract public class Person {
    FullName fullName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info () {
        return "First name: " +  " Last name: " + " Age: " + getAge();
    }

    abstract public String activity();
}
