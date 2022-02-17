package hw8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hw2 {
	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Табуретка", "Максим");
		personMap.put("Лавочка", "Лена");
		personMap.put("Стул", "Олексей");
		personMap.put("Стакан", "Иван");
		personMap.put("Ложка", "Тимофей");
		personMap.put("Штора", "Иван");
		personMap.put("Часы", "Сергей");
		personMap.put("Сковародка", "Богдан");
		personMap.put("Нож", "Виталий");
		personMap.put("Чайник", "Влад");

		for (Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		Set<String> person = new HashSet<>(personMap.values());
		System.out.println(person);
		
		if (personMap.size() == person.size()) {
			System.out.println("Нет людей с одинаковыми именами");
		} else {
			System.out.println("Есть люди с одинаковыми именами");
		}
		
		personMap.values().remove("Влад");
		System.out.println(personMap);
	}
}
