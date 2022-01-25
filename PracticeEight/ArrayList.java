package PracticeEight;


import java.util.List;
import java.util.Random;

public  class ArrayList {
    //Method for random generating collection
    public void randomListGen(List<Integer> collection) {
        for (int i = 0; i < 10; i++) {
            double random = Math.random() * 30;
            collection.add((int) random);
        }
        System.out.println("Created List is : ");
        printList(collection);
    }
    //Method for printing collections

    public void printList(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    //Method for removing elements from List
    public void removingElements(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > 20) {
                collection.remove(i);
            }
        }
        System.out.println("MyCollection after removing : ");
        printList(collection);
    }

    //Method for adding elements in position
    public void addingElementsInPos(List<Integer> collection, int pos, int value) {
        if (collection.size() < pos) {
            System.out.println("Sorry array too small ");
        } else {
            collection.add(pos, value);
            System.out.println("MyCollection after adding : ");
            printList(collection);
        }
    }
}