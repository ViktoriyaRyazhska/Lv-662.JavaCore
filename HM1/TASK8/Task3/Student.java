package Task_8HM.Task3;

//Write class Student that provides information about the name of the student and his course. Class Student should consist of
//1)properties for access to these fields
//2)constructor with parameters
//3)method printStudents (List students, Integer course), which receives a list of students and the course number and
// prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//4)methods to compare students by name and by course

import java.util.List;
import java.util.Scanner;

public class Student {

    //fields
    private String Name;
    private Integer course;

    //constructor
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

    public String toString(){
        return this.Name + " " + this.course;
    }

    public static void printStudents(List<Student> Students){

            Scanner sc = new Scanner(System.in);
            int CourseOfStudent = sc.nextInt();
            for(int i = 0 ; i < Students.size();i++){
               if (CourseOfStudent == Students.get(i).getCourse()){
                   System.out.println(Students.get(i).getName());
               }

            }
        }
}

