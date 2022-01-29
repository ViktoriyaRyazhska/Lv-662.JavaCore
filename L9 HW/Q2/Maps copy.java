package l9HWQ2;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	public static void map() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Alex", "A");
		map1.put("Abby", "Coco");
		map1.put("Cathy", "Lolo");
		map1.put("John", "Doe");
		map1.put("Jane", "Doe");
		map1.put("Amy", "Yoyo");
		map1.put("Anne", "Fofo");
		map1.put("Alex", "B");
		map1.put("Orest", "Dodo");
		map1.put("Amelia", "Bobo");
		System.out.println("Pre removal: " + map1);
		
		map1.remove("Orest");
		System.out.println("Post removal: " + map1);
	
		
	}

}
