package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Sasha", 2));
        students.add(new Student("Max", 3));
        students.add(new Student("Misha", 2));
        students.add(new Student("Vlad", 4));


       Student.printStudents(students, 4);

        System.out.println();

        students.sort(Student.getCourseComparator());

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getCourse());
        }

        System.out.println();

        students.sort(Student.getNameComparator());

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getCourse());
        }



    }
}
/*
3. Write class Student that provides information about the name of the student and his
        course. Class Student should consist of
        a) properties for access to these fields
        b) constructor with parameters
        c) method printStudents (List students, Integer course), which receives a list of students
        and the course number and prints to the console the names of the students from
        the list, which are taught in this course (use an iterator)
        d) methods to compare students by name and by course
        e) In the main() method
        • declare List students and add to the list five different students
        • display the list of students ordered by name
        • display the list of students ordered by course.
*/