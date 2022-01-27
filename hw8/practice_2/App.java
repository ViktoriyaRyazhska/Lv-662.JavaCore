package hw8.practice_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> employeeMap = new HashMap<>();
		
		employeeMap.put(1, "Quentin");
		employeeMap.put(2, "Peter");
		employeeMap.put(3, "Joseph");
		employeeMap.put(4, "Mike");
		employeeMap.put(5, "Maya");
		employeeMap.put(6, "Bill");
		employeeMap.put(7, "Kate");
		
		System.out.println(employeeMap);
		System.out.print("Please enter employee ID: ");
		int id = Integer.parseInt(reader.readLine());
		
		if (employeeMap.containsKey(id)) {
			System.out.println("Match found: ID: " + id + ", name: " + employeeMap.get(id));
		} else {
			System.out.println("No matches found.");
		}
		
		System.out.print("Please enter employee name: ");
		String name = reader.readLine();
		reader.close();
		
		if (employeeMap.containsValue(name)) {
			
			for (Map.Entry<Integer, String> entry: employeeMap.entrySet()) {
				
				if (entry.getValue().equals(name)) {
				System.out.println("Match found: name: " + name + ", ID: " + entry.getKey());
				}
			
			}
			
		} else {
			System.out.println("No matches found.");
		}
		
	}

}
