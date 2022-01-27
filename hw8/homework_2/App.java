package hw8.homework_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<>();
		personMap.put("Blunt", "Emily");
		personMap.put("Brolin", "Josh");
		personMap.put("Del Toro", "Benicio");
		personMap.put("Bernthal", "Jon");
		personMap.put("Garber", "Victor");
		personMap.put("Kaluuya", "Daniel");
		personMap.put("Donovan", "Jeffrey");
		personMap.put("Larrichio", "Kim");
		personMap.put("Rogerson", "Hank");
		personMap.put("Arreola", "Edgar");
		
		System.out.println(personMap);
		
		if (hasValueDuplicates(personMap)) {
			System.out.println("There are at least two persons with the same first name.");
		} else {
			System.out.println("There are no persons with the same first name.");
		}
		
		personMap.values().remove("Edgar");
		
		System.out.println(personMap);
			
	}
	
	public static boolean hasValueDuplicates(Map<String, String> map) {
		
		Set<String> set = new HashSet<>();
		
		boolean answer = false;
		
		for (String string : map.values()) {
			
			if (set.add(string) == false) {
				answer = true;
				break;
			}
		}
		
		return answer;
		
	}

}
