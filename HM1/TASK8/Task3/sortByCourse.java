package Task_8HM.Task3;

import java.util.Comparator;
public class sortByCourse implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getCourse() - b.getCourse();
    }
}
