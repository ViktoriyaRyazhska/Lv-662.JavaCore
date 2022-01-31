import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pt2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		In the main() method declare map employeeMap of pairs <Integer, String>.		
		Map <Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(14318, "Tim");
		employeeMap.put(15464, "Tom");
		employeeMap.put(23449, "Tod");
		employeeMap.put(50083, "Tad");
		employeeMap.put(77884, "Tak");
		employeeMap.put(95468, "Tik");
		employeeMap.put(12352, "Tok");
		employeeMap.put(42637, "Tuk");
		
		for (Entry<Integer, String> entry : employeeMap.entrySet()) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
//		Ask user to enter ID, then find and write corresponding name from your map. 	
		System.out.println("Please, enter the ID number: ");
		int ID = Integer.parseInt(br.readLine());
		
		if (employeeMap.containsKey(ID)) {
			System.out.println("Name of employee is " + employeeMap.get(ID));
		} else {
			System.out.println("This employee can't be find");
		}
		
//		Ask user to enter name, verify than you have name in your map and write corresponding ID.
		System.out.println("Please, enter name of employee: ");
		String name = br.readLine();
		
		if (employeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (name.equals(entry.getValue())) {
					System.out.println("ID of employee " + name + " is " + entry.getKey());
				}
			}
		} else {
			System.out.println("This ID can't be find");
		}
		
	}

}
