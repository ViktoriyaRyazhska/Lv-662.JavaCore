package prTask_8_p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);
        myCollection.add(31);
        myCollection.add(2);
        myCollection.add(-5);
        myCollection.add(7);
        myCollection.add(4);
        myCollection.add(21);
        myCollection.add(7);
        myCollection.add(-3);
        myCollection.add(8);
        myCollection.add(1);

        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20){
                myCollection.remove(i);
            }
        }
        System.out.println(myCollection);


        for (int i = 0; i < myCollection.size(); i++) {
            if (i == 2){
                myCollection.add(2, 1);
            }
            if (i == 8){
                myCollection.add(8, -3);
            }
            if (i == 5){
                myCollection.add(5, -4);
            }
        }

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position " + i + ", value of element " + myCollection.get(i));

        }

        Collections.sort(myCollection);
        System.out.print("Sorted collection: ");
        System.out.println(myCollection);

    }
}
