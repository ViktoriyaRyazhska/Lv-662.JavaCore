package lesson_9.Homework;

import java.util.Comparator;

public class StudentCourseComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCourse(), o2.getCourse());
    }
}
