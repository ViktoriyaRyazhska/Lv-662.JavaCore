package hw8.practice_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		List<Integer> myCollection = new ArrayList<>();
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			myCollection.add(rand.nextInt(25));
		}
		
		System.out.println("Initial collection: " + myCollection);
		
		List<Integer> newCollection = new LinkedList<>();
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}
		
		System.out.println("Find and save in list newCollection all positions of element more than 5 in the collection.");
		System.out.print("Print newCollection: ");
		System.out.println(newCollection);
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
			}			
		}
		
		System.out.println("Remove from collection myCollection elements, which are greater then 20.");
		System.out.print("Print result: ");
		System.out.println(myCollection);
		
		System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5.");
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 1);
		map.put(5, -4);
		map.put(8, -3);
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				
			int key = entry.getKey();
			int value = entry.getValue();
				
			try {
				myCollection.add(key, value);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Can't insert " + value + " into position " + key + ".");
				System.out.println("There in no such position in this collection.");
			}
								
		}
		
		System.out.println("Print result in the format: “position – xxx, value of element – xxx”.");
		
		for (int i = 0; i < myCollection.size(); i++ ) {
			System.out.println("position - " + i 
					         + ", value of element – " + myCollection.get(i));
		}
		
		System.out.print("Sort and print collection: ");
		
		myCollection.sort(null);
		
		System.out.println(myCollection);
		
	}

}
