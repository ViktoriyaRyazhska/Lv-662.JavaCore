import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Name {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Dyvak", "Taras");
		personMap.put("Kozak", "Tetyana");
		personMap.put("Sadova", "Iryna");
		personMap.put("Kit", "Igor");
		personMap.put("Nova", "Nina");
		personMap.put("Dub", "Ivan");
		personMap.put("Bila", "Sonya");
		personMap.put("Petrov", "Borys");
		personMap.put("Shevchenko", "Kateryna");
		personMap.put("Yaremchuk", "Iryna");

		for (Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		Set<String> person = new HashSet<>(personMap.values());
		System.out.println(person);
		
		if (personMap.size() == person.size()) {
			System.out.println("There no workers with the same name!");
		} else {
			System.out.println("Some of following workers names are repeated.");
		}
		
		personMap.values().remove("Taras");
		System.out.println(personMap);
	}
}
