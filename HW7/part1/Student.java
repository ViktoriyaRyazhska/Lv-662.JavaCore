package com.company;

public class Student extends Person {
    private int course;

    public Student(String firstName, String secondName, int age, int course) {
        super(new FullName(firstName, secondName), age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return "First name = " + fullName.getFirstName() + ", Second name = " + fullName.getSecondName() + ", age = " + getAge() + ", course = " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}

