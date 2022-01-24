package lesson_9.ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(34, "Anna");
        employeeMap.put(23, "Maria");
        employeeMap.put(12, "Roza");
        employeeMap.put(2, "Gina");
        employeeMap.put(4, "Marga");
        employeeMap.put(5, "Sem");
        employeeMap.put(61, "John");

        System.out.println("Initial Mappings are: " + employeeMap);
        System.out.println("Please enter ID");
        int y = Integer.parseInt(br.readLine());

  //      System.out.println(employeeMap.getOrDefault(y,"no such id"));

        if (employeeMap.containsKey(y)) {
            System.out.println(employeeMap.get(y));
        } else {
            System.out.println("There is no such employee");
        }

        System.out.println("Please enter name");
        String name = br.readLine();


        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (name.equals(entry.getValue())) {
                    System.out.println("ID = " + entry.getKey());
                }
            }
        }
        else {
            System.out.println("There is no such employee");
        }



    }

}