package Task_8HM.Task3;

import java.util.Comparator;
public class sortByName implements Comparator<Student> {
     public int compare(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }
}
