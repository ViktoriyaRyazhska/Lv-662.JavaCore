package com.company;

import java.util.*;
import java.util.Set;

import static com.company.Set.*;


public class Main {

    public static String getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        String value;
        for (Map.Entry<String, String> firstName : map.entrySet()) {
            value = firstName.getValue();
            if (value.equals(name)) {
                count++;
            }
        }
        if(count >= 2) {
            return "There are more than two people with the same name";
        } else  return "There are less than two persons with the same firstName";
    }

    public static <personMap> void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        set1.add(5);
        set1.add(7);
        set1.add(3);

        set2.add(5);
        set2.add(1);

        System.out.println(union(set1, set2));

        System.out.println(intersect(set1, set2));

        //2

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Kirichenko", "Sasha");
        personMap.put("Zubenko", "Orest");
        personMap.put("Golovko", "Katya");
        personMap.put("Ivanov", "Orest");
        personMap.put("Marokarova", "Lena");
        personMap.put("Frolov", "Boris");
        personMap.put("Basov", "Artem");
        personMap.put("Popov", "Grigoriy");

        Map<String, String> personMapClone = new HashMap<>(personMap);
        String tmp;

        for (Map.Entry<String, String> person : personMap.entrySet()) {
            if (person.getValue().equals("Orest")) {
                tmp = person.getKey();
                personMapClone.remove(tmp);
            }
        }

        for (Map.Entry<String, String> person : personMapClone.entrySet()) {
            System.out.println("Last name: " + person.getKey() + " First name: " + person.getValue());
        }

        System.out.println();
        System.out.println(getCountTheSameFirstName(personMap, "Orest" ));

    }
}

/*
1. Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets. Test the operation of
these techniques on two pre-filled sets.
2. Create map personMap and add to it ten persons of type <String, String> (lastName,
firstName).
Output the entities of the map on the screen.
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */