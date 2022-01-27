package Task_8HM.Task2;

import java.util.HashMap;
import java.util.Map;

import static Task_8HM.Task2.Task2Map.personWithSameFirsName;

//Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
//Output the entities of the map on the screen.
//There are at less two persons with the same firstName among these 10 people?
//Remove from the map person whose firstName is ”Orest” (or other). Print result

public class AppTask2 {
    public static void main(String[] args) {


        Map<String, String> personMap = new HashMap<String,String>();
        personMap.put("Smith","Kate");
        personMap.put("Davies","Ted");
        personMap.put("Taylor","Lara");
        personMap.put("Kovalchuk","Tanya");
        personMap.put("Johnson","Jek");
        personMap.put("Paselska","Oksana");
        personMap.put("Smetaniyak","Orest");
        personMap.put("Brown","Jana");
        personMap.put("Sveleba","Taras");
        personMap.put("Wilson","Tom");

        System.out.println(personMap);
        personWithSameFirsName(personMap);
        personMap.remove("Smetaniyak");
        System.out.println(personMap);


    }
}
