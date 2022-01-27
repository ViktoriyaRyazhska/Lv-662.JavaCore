package Task_8HM.Task2;

import java.util.*;

public class Task2Map {

    public static void personWithSameFirsName(Map<String,String> personMap) {
       int i = 0;
        for (Map.Entry<String, String> element : personMap.entrySet()) {
            String tempName = element.getValue();
            for (Map.Entry<String, String> nextElement :personMap.entrySet()) {
                if (nextElement.getValue().equals(tempName)) {
                    i += 1;
                }
            }
        }
        if (i > personMap.size()) {
            System.out.println("There are more than two same names in the list");
        }
        else if(i == personMap.size()){
            System.out.println("No persons with same names");
        }
    }
}




