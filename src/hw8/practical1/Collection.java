package hw8.practical1;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);
        myCollection.add(-5);
        myCollection.add(-8);
        myCollection.add(4);
        myCollection.add(52);
        myCollection.add(56);
        myCollection.add(55);
        myCollection.add(15);
        myCollection.add(-65);
        myCollection.add(66);
        myCollection.add(67);

        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5)
                newCollection.add(i);
        }
        System.out.print("newCollection: ");
        System.out.println(newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.print("\nmyCollection with elements that <20: ");
        System.out.println(myCollection);

        Map<Integer, Integer> newElements = new HashMap<>(3);
        newElements.put(2, 1);
        newElements.put(8, -3);
        newElements.put(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            for (Map.Entry<Integer, Integer> entry : newElements.entrySet()) {
                if (i == entry.getKey()) {
                    myCollection.add(entry.getKey(), entry.getValue());
                }
            }
        }

        System.out.println("\nmyCollection with new elements and position:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position – " + i + ", Value of element – " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.print("\nmyCollection sorted: ");
        System.out.println(myCollection);
    }
}
