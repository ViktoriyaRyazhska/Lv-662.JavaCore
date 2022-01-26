package lesson_9.Homework;

import java.util.Set;
import java.util.TreeSet;

public class Union_Intersect {

    public static Set<Integer> union(Set<Integer> setOne, Set<Integer> setTwo) {
        Set<Integer> unionSet = new TreeSet<>();
        for (Integer element : setOne) {
            unionSet.add(element);
        }
        for (Integer element : setTwo) {
            unionSet.add(element);
        }
        return unionSet;
    }


    public static Set<Integer> intersect(Set<Integer> setOne, Set<Integer> setTwo) {
        Set<Integer> intersectSet = new TreeSet<>();
        for (Integer elementSetOne : setOne) {
            for (Integer elementSetTwo : setTwo) {
                if (elementSetOne.equals(elementSetTwo)) {
                    intersectSet.add(elementSetOne);
                }
            }
        }
        return intersectSet;
    }

    public static void main(String[] args) {
     Set <Integer> setOne = new TreeSet<>();
     for (int i = 0; i < 10; i++) {
         setOne.add(i);
     }
        System.out.println(setOne);

        Set <Integer> setTwo = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            setTwo.add(i++);
        }
        System.out.println(setTwo);
        System.out.println(union(setOne, setTwo ));
        System.out.println(intersect(setOne, setTwo ));

    }
}
