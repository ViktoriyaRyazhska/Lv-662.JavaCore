package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Student {
    private String name;
    private int course;

    public static StudentNameComparator nameComparator = new StudentNameComparator();
    public static  StudentCourseComparator courseComparator = new StudentCourseComparator();

    public static Comparator<Student> getNameComparator(){
        return nameComparator;
    }

    public static Comparator<Student> getCourseComparator(){
        return courseComparator;
    }


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    public static void printStudents(List<Student> students, Integer course){
        String tmp = null;
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student t = iterator.next();
            if(course == t.getCourse()){
                tmp = t.getName();
                System.out.println(tmp + " is studying on the " + course + " course");
            }
        }
    }

    public int compareTo(Student e) {
        return name.compareTo(e.getName());
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
}
/*
Write class Student that provides information about the name of the student and his
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