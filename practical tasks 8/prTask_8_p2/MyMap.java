package prTask_8_p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Map<Integer,String> employeeMap = new HashMap<>(7);
        employeeMap.put(125, "Olga");
        employeeMap.put(95, "Petro");
        employeeMap.put(112, "Iryna");
        employeeMap.put(8, "Natalia");
        employeeMap.put(87, "Max");
        employeeMap.put(144, "Maria");
        employeeMap.put(77, "Roman");

        System.out.println(employeeMap);

        System.out.println("Please enter employee ID");
        int x = Integer.parseInt(br.readLine());

        if (employeeMap.containsKey(x)) {
            System.out.println(employeeMap.get(x));
        }
        else {
            System.out.println("Wrong ID");
        }


        System.out.println("Please enter employee name");
        String name = br.readLine();

        if (employeeMap.containsValue(name)){
            for (Map.Entry<Integer,String> entry : employeeMap.entrySet()) {
                if (name.equals(entry.getValue())) {
                    System.out.println("ID for this name is " + entry.getKey());

                }

            }
        }
        else{
            System.out.println("Wrong employee name");
        }

    }
}
