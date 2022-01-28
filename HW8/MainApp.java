package HW8;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void printMap(Map<String, String> map){
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("LastName: " + entry.getKey() +
                  " FirstName: " + entry.getValue());
        }
    }
    public static void searchingTwoNames(Map<String, String> map){
        int count =0;
            for (Map.Entry<String, String> element : map.entrySet()) {
                String tempName = element.getValue();
                for (Map.Entry<String, String> nextElement : map.entrySet()) {
                    if (nextElement.getValue().equals(tempName)) {
                        count += 1;
                    }
                }
            }
            if (count > map.size()) {
                System.out.println("There are more than two same names in the list");
            }
            else if(count == map.size()){
                System.out.println("No persons with same names");
            }
        }
    public static void removingPerson(Map<String,String> map, String personName) {
        if (map.containsValue(personName)) {
            String tempKey = null;
            for (Map.Entry<String, String> element : map.entrySet()) {
                if (personName.equals(element.getValue())) {
                   tempKey = element.getKey();
                }
            }
            map.remove(tempKey);
        }
        System.out.println("List after removing");
        printMap(map);
    }
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Machli", "Amaka");
        personMap.put("Maybelle", "Elfleda");
        personMap.put("Doroteia", "Dardana");
        personMap.put("Eulalia", "Luisinho");
        personMap.put("Simon", "Jakob");
        personMap.put("Ileana", "Karla");
        personMap.put("Ricards", "Giorgos");
        personMap.put("Titianus", "Ramsay");
        personMap.put("Denis", "Jakob");

        printMap(personMap);

        searchingTwoNames(personMap);

        removingPerson(personMap,"Jakob");

    }
}
