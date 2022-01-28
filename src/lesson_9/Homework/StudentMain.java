package lesson_9.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        List<Student> Info = new ArrayList<>();
        Info.add(new Student("Anna", 5));
        Info.add(new Student("Mariia", 6));
        Info.add(new Student("Lily", 5));
        Info.add(new Student("Jack", 5));
        Info.add(new Student("Tina", 5));

        Student.print(Info, 5);

        StudentNameComparator NameComparator = new StudentNameComparator();
        Collections.sort(Info, NameComparator);
        System.out.println(Info);

        StudentCourseComparator CourseComparator = new StudentCourseComparator();
        Collections.sort(Info, CourseComparator);
        System.out.println(Info);


// Sorting by Name and then by Course:
//        Info.sort(Comparator.comparing(Student::getName)
//                .thenComparing(Student::getCourse));
//        System.out.println(Info);


    }
}
