package HW8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student {
    //fields
    private String Name;
    private Integer course;

    //constructor

    public Student(){}
    public Student(String name, Integer course) {
        Name = name;
        this.course = course;
    }

    //methods
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String toString() {
        return this.Name + " " + this.course;
    }

    public static void printStudents(List<Student> Students) {
        Scanner sc = new Scanner(System.in);
        Integer courseNumber = sc.nextInt() ;
        for (int i = 0; i < Students.size(); i++) {
            if(Students.get(i).getCourse() == courseNumber){
                System.out.println(Students.get(i).getName());
            }
        }
    }
}

 class sortByCourse implements Comparator<Student> {
    public int compare(Student a,Student b){
        return a.getCourse() - b.getCourse();
    }
}
class sortByName implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }
}
 class sortByCourseAndName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        a.getName().compareTo(b.getName());
        return a.getCourse() - b.getCourse();
    }
}