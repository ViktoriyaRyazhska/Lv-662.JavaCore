package Task_8HM.Task1;

import java.util.HashSet;
import java.util.Set;

public class unionAndIntersection {

//Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), realizing
// the operations of union and intersection of two sets. Test the operation of these techniques on two pre-filled sets.

    public static void union(Set set1,Set set2){
    Set<Integer> unionSet = new HashSet<>(set1);
       unionSet.addAll(set2);
        System.out.println(unionSet);
    }

    public static void intersect(Set set1,Set set2) {
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        System.out.println(intersectSet);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(10);

        union(set1,set2);
        intersect(set1,set2);
    }
}

