package pk72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pk2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Map <Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(123, "Олег");
		employeeMap.put(345, "Влад");
		employeeMap.put(567, "Дима");
		employeeMap.put(789, "Денис");
		employeeMap.put(678, "Андрей");
		employeeMap.put(101, "Слава");
		employeeMap.put(347, "Антон");
		
		for (java.util.Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("Введите ID: ");
		int ID = Integer.parseInt(br.readLine());
		
		if (employeeMap.containsKey(ID)) {
			System.out.println("Имя: " + employeeMap.get(ID));
		} else {
			System.out.println("Вы ввели неправельное ID!");
		}
		
		System.out.println("Введите имя: ");
		String name = br.readLine();
		
		if (employeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (name.equals(entry.getValue())) {
					System.out.println("ID сотрудника " + name + " : " + entry.getKey());
				}
			}
		} else {
			System.out.println("Данного сотрудника не существует!");
		}
		
	}

}

