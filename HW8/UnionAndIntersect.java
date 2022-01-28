package HW8;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {
    public static void union(Set setOne, Set setTwo){
        Set<Integer> uniSet = new HashSet<>(setOne);
        uniSet.addAll(setTwo);
        System.out.println("After union");
        System.out.println(uniSet);
    }

    public static void intersect(Set setOne, Set setTwo){
        Set<Integer> interSect = new HashSet<>(setOne);
        interSect.retainAll(setTwo);
        System.out.println("After intersect");
        System.out.println(interSect);
    }

    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);


        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(3);
        setTwo.add(4);
        setTwo.add(5);


        union(setOne,setTwo);
        intersect(setOne,setTwo);
    }
}
