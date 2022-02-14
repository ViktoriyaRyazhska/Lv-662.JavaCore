package hw8_p3;

import java.util.ArrayList;

import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Pavlo", 2));
        students.add(new Student("Anna", 4));
        students.add(new Student("Yana", 5));
        students.add(new Student("Oles", 1));
        students.add(new Student("Maria", 3));

        ComparatorByName comparatorByName = new ComparatorByName();
        students.sort(comparatorByName);
        System.out.println(students);

        ComparatorByCourse comparatorByCourse = new ComparatorByCourse();
        students.sort(comparatorByCourse);
        System.out.println(students);



        // probably it is better method:

       /* students.sort(Comparator.comparing(Student::getName));
          System.out.println(students);
          students.sort(Comparator.comparing(Student::getCourse));
          System.out.println(students);*/



    }
}