package hw8_p1_p2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetAndMap {
    public static void main(String[] args) {

      //Task 1

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(7);
        set1.add(2);
        set1.add(1);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(5);
        set2.add(8);
        set2.add(4);
        set2.add(1);

        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<Integer> intersect = new HashSet<>(set1);
        // or:  Set<Integer> intersect = new HashSet<>();
        //      intersect.addAll(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);

        //Task 2

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ivanenko", "Oleg");
        personMap.put("Petrenko", "Ivan");
        personMap.put("Ovchenko", "Maria");
        personMap.put("Loomis", "Robert");
        personMap.put("Kotenko", "Victor");
        personMap.put("Bachynska", "Maria");
        personMap.put("Lozynskyy", "Victor");
        personMap.put("Nikolenko", "Rostyslav");
        personMap.put("Demchenko", "Nazar");
        personMap.put("Olischuk", "Nina");

        for (Map.Entry entry: personMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> personSet = new HashSet<>(personMap.values());
        System.out.println("List of first names which do not recur: " + personSet);

        if (personMap.size() == personSet.size()){
            System.out.println("There are no any persons with the same first name");
        }
        else {
            System.out.println("There are some persons with the same first name");
        }

        personMap.values().remove("Nazar");
        System.out.println("New list of persons after removing : ");
        for (Map.Entry entry: personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}