package lesson_9.ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<> (10);
        myCollection.add(4);
        myCollection.add(8);
        myCollection.add(4);
        myCollection.add(3);
        myCollection.add(2);
        myCollection.add(4);
        myCollection.add(1);
        myCollection.add(3);
        myCollection.add(2);
        myCollection.add(4);
        myCollection.add(45);

        List <Integer> newCollection = new ArrayList<>();

        System.out.println("Task 1. Find and save in list newCollection all positions of element more than 5 in the collection. " +
                "Print newCollection");

        for (int i = 0; i < myCollection.size(); i++) {
            if ( myCollection.get(i) > 5 ) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection + "\n");


        System.out.println("Task 2. Remove from collection myCollection elements, which are greater then 20. " +
                "Print result");
        for (int i = 0; i < myCollection.size(); i++) {
            if ( myCollection.get(i) > 20 ) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println(myCollection + "\n");

        System.out.println("Task 3. Insert elements 1, -3, -4 in positions 2, 8, 5. " +
                "Print result in the format: \"position – xxx, value of element – xxx\"");

        for (int i = 0; i < myCollection.size(); i++) {
            if (i==2) {
                myCollection.add(2, 1);
            }
            if (i==8) {
                myCollection.add(8, -3);

            }  if (i==5) {
                myCollection.add(5, -4);
            }
        }
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i +  ", value of element – " + myCollection.get(i));
        }

        System.out.println("\nTask 4. Sort and print collection");
        Collections.sort(myCollection);
        System.out.println(myCollection);

    }
}
