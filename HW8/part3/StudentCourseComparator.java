package com.company;

import java.util.Comparator;

public class StudentCourseComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCourse(), s2.getCourse());
    }
}
