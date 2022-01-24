package hw8.practical2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class employeeApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(10, "Jake");
        employeeMap.put(25, "Terry");
        employeeMap.put(3, "Boyl");
        employeeMap.put(44, "Jina");
        employeeMap.put(9, "Emmy");
        employeeMap.put(1, "Rosa");
        employeeMap.put(4, "Hitchcock");

        System.out.println(employeeMap);

        System.out.println("\nEnter Employee ID:");
        int a = Integer.parseInt(br.readLine());
        // Intellij says it can be replaced with one line:
        // System.out.println(employeeMap.getOrDefault(a, "No such ID"));
        if (employeeMap.containsKey(a)) {
            System.out.println(employeeMap.get(a));
        } else {
            System.out.println("No such ID");
        }

        System.out.println("\nEnter Employee Name:");
        String b = br.readLine();
        if (employeeMap.containsValue(b)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (b.equals(entry.getValue())) {
                    System.out.println("ID:" + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("No such name");
        }
    }
}
