package pk7;
import java.util.*;

public class Pk {

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>(10); 
		for(int i=0;i<10;i++) {
			double random = Math.random() * 25;
			myCollection.add((int) random);
		}
		
		System.out.println(myCollection);

		Collection<Integer> newCollection = new ArrayList<Integer>();
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) >= 5) {
				newCollection.add(myCollection.get(i));

			}
		}
		System.out.println("\n" + newCollection +">5");
	
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;

			}
		}
		System.out.println("\n"+myCollection +"<20");
		
		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		
		System.out.println("\n"+myCollection );
		for (int i = 0; i < myCollection.size(); i++) {
				System.out.println("\nПозиция  - " + (i+1) + ", значение - " + myCollection.get(i) + ".");	
		}
		Collections.sort(myCollection);

	        System.out.print(myCollection);
	      }
	}


