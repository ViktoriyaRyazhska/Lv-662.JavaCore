package PracticeEight;

import java.util.*;
import java.util.ArrayList;

public class CollectionApp {

    public static void main(String[] args) {

        PracticeEight.ArrayList arrayList = new PracticeEight.ArrayList();

        List<Integer> myCollection = new ArrayList<>();

        arrayList.randomListGen(myCollection);

        List<Integer> newCollection = new ArrayList<>();

        for (Integer element : myCollection) {
            if (element > 5) {
                newCollection.add(myCollection.indexOf(element));
            }
        }

        System.out.println("Position of elements higher than  5 : ");
        arrayList.printList(newCollection);

        arrayList.removingElements(myCollection);

        arrayList.addingElementsInPos(myCollection,4,20);

        System.out.println("Collection after sorting  : ");

        Collections.sort(myCollection);
        arrayList.printList(myCollection);

    }
}
