package HW8;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
    public static void main(String[] args) {

        Student st1 = new Student("Max", 1);
        Student st2 = new Student("Sergiy", 2);
        Student st3 = new Student("Anton", 4);
        Student st4 = new Student("Ruslan", 4);
        Student st5 = new Student("Oleg", 5);


        ArrayList<Student> Students = new ArrayList<Student>();
        Students.add(st1);
        Students.add(st2);
        Students.add(st3);
        Students.add(st4);
        Students.add(st5);

        System.out.println("Sorted by Name");
        Collections.sort(Students, new sortByName());
        Student.printList(Students);

        System.out.println("Sorted by Course");
        Collections.sort(Students, new sortByCourse());
        Student.printList(Students);

        System.out.println("Sorted by Name and Course");
        Collections.sort(Students , new sortByCourseAndName());
        Student.printList(Students);

        System.out.println("Enter course number");
        Student.printStudents(Students);
    }
}