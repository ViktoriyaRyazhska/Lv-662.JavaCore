package com.company;

public abstract class Person {
    public FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name=" + fullName.getFirstName() + "Second name=" + fullName.getSecondName() + ", age=" + age;
    }

    public abstract String activity();
}
