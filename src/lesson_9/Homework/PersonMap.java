package lesson_9.Homework;

import java.util.*;

public class PersonMap {


    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Diaz", "Roza");
        personMap.put("Peralta", "Jake");
        personMap.put("Santiago", "Amy");
        personMap.put("Kapitan", "Holt");
        personMap.put("Peretti", "Gina");
        personMap.put("Anna", "Mariia");
        personMap.put("Jelly", "Roza");
        personMap.put("Anita", "Roza");
        personMap.put("Skot", "Dana");
        personMap.put("Kendel", "Josh");


//        Output the entities of the map using iterator:
//        Iterator iter = personMap.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry) iter.next();
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Set<String> values = new HashSet<>();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            values.add(entry.getValue());
        }
        System.out.println(values);


        if (values.size() != personMap.size()) {
            System.out.println("Yes, we have persons with the same firstName");
        }

        personMap.values().remove("Roza");
        Object obj = personMap.remove("Anita");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



