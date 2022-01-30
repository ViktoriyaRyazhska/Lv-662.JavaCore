package hw8.homework2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonApp {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>() {
            @Override
            public String toString() {
                StringBuilder stb = new StringBuilder();
                for (Map.Entry<String, String> entry : this.entrySet()) {
                    stb.append(entry.getKey()).append(" ")
                            .append(entry.getValue()).append("\n");
                }
                return stb.toString();
            }
        };

        personMap.put("Cruz", "Tom");
        personMap.put("Gardener", "Jeniffer");
        personMap.put("Koval", "Taras");
        personMap.put("Willis", "Brus");
        personMap.put("Theron", "Charlize");
        personMap.put("Mytrenko", "Ivanna");
        personMap.put("Kruts", "Taras");
        personMap.put("Holodnyi", "Mykola");
        personMap.put("Kvasnyj", "Taras");
        personMap.put("Pysanka", "Ruslana");

        System.out.println(personMap);

        Set<String> twoPersons = new HashSet<>(personMap.values());

        if (personMap.size() - twoPersons.size() >= 2) {
            System.out.println("There are at less two persons with the same firstName\n");
        } else {
            System.out.println("There no two persons or more with the same firstName\n");
        }

        System.out.println("Remove from the map persons with firstName Taras:");
        while (personMap.containsValue("Taras")) {
            personMap.values().remove("Taras");
        };
        System.out.println(personMap);

    }

}
