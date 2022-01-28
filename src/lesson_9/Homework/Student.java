package lesson_9.Homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students: " +
                "name = " + name +
                ", course = " + course + "\n";
    }

    public static void print(List students, Integer course) {
        System.out.println("Students who are attending " + course + " courses:");
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (course == student.getCourse()) {
                System.out.println("Name - " + student.getName());
            }
        }
    }

    }




