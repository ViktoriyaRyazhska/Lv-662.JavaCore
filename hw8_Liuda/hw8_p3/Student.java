package hw8_p3;


import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Student {
    private String name;
    private int course;

    public Student(String name,int course){
        this.name = name;
        this.course = course;
    }
    public String getName(){
        return name;
    }
    public int getCourse(){
        return course;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){

        return "\nStudent " + name + " is on " + course + " course";
    }

    public static void printStudents(List<Student> students, Integer course){  //I don't understand why there is written "Method 'printStudents' is never used"
        ListIterator<Student> studentIterator = students.listIterator();       // And I don't see the reason of parameter "Integer course" (required in homework description)

        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next().getName());
        }
        students.listIterator(students.size());
        while (studentIterator.hasPrevious()) {
            System.out.println(studentIterator.hasPrevious());
        }


    }
}
