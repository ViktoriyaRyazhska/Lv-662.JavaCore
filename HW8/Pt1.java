import java.io.*;
import java.util.*;

public class Pt1 {

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>(10); // list працює без приведення типів
		myCollection.add(5);
		myCollection.add(8);
		myCollection.add(10);
		myCollection.add(3);
		myCollection.add(2);
		myCollection.add(7);
		myCollection.add(21);
		myCollection.add(25);
		myCollection.add(18);
		myCollection.add(-5);
		
		System.out.println(myCollection);

		Collection<Integer> newCollection = new ArrayList();
		

//		all positions of element more than 5
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) >= 5) {
				newCollection.add((i));
//				System.out.print(" " + myCollection.get(i));
			}
		}
		System.out.println("\n" + newCollection);
		
		
//		Remove from collection myCollection elements, which are greater then 20.
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;

			}
		}
		System.out.println(myCollection);
		
//		Insert elements 1, -3, -4 in positions 2, 8, 5.

		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		
		System.out.println(myCollection);
		for (int i = 0; i < myCollection.size(); i++) {
				System.out.print("Possition - " + (i+1) + ", value of element - " + myCollection.get(i) + ". \n");	
		}
		
//		Sort and print collection 
		
		Collections.sort(myCollection);
		System.out.println("\nThe sorted list is:");
	    for (Integer sort: myCollection) {
	        System.out.print(" " + sort);
	      }
	}
}
