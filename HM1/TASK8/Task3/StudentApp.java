package Task_8HM.Task3;

//In the main() method
//1)declare List students and add to the list five different students
//2)display the list of students ordered by name
//3)display the list of students ordered by course.

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentApp {
    public static void main(String[] args) {

        Student st1 = new Student("Taras",1);
        Student st2 = new Student("Oksana",2);
        Student st3 = new Student("Tanya",3);
        Student st4 = new Student("Ura",4);
        Student st5 = new Student("Victoria",1);


        List<Student> Students = new ArrayList<Student>();
        Students.add(st1);
        Students.add(st2);
        Students.add(st3);
        Students.add(st4);
        Students.add(st5);

        System.out.println("\nPrint Students course ");
        Student.printStudents(Students);


        System.out.println("\nSorted by Name");
        Collections.sort(Students , new sortByName());
        for (int i = 0 ;i<Students.size();i++)
            System.out.println(Students.get(i));

        System.out.println("\nSorted by Course");
        Collections.sort(Students , new sortByCourse());
        for (int i = 0 ;i<Students.size();i++)
            System.out.println(Students.get(i));

        System.out.println("\nSorted by Name and Course");
        Collections.sort(Students , new sortByCourseAndName());
        for (int i = 0 ;i<Students.size();i++)
            System.out.println(Students.get(i));

    }
}
