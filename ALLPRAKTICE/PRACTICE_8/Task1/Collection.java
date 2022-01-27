package Task_8Praktice.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection {
// Declare collection myCollection of 10 integers and fill it (from the console or random).
//Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
//Remove from collection myCollection elements, which are greater then 20. Print result
//Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
//Sort and print collection
// Use one or more of the next Collections: List, ArrayList, LinkedList

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> myCollection = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x = Integer.parseInt(br.readLine());
            myCollection.add(i, x);
        }
        System.out.println(myCollection);

        List newCollection = new LinkedList();
        for (Integer element : myCollection) {
            if (element > 5){
                newCollection.add(myCollection.indexOf(element));
            }
        }


        System.out.println(newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println(myCollection);


        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i + " , value of element – " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println(myCollection);

    }
}
