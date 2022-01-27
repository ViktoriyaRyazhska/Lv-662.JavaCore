package Task_8HM.Task3;

import java.util.Comparator;
public class sortByCourseAndName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        a.getName().compareTo(b.getName());
        return a.getCourse() - b.getCourse();
    }
}
