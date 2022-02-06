package Task_11Praktice.Task3;
//Prepare myText.txt file with a lot of text inside.
//Read context from file into array of strings.
//Each array item contains one line from file.
//Complete next tasks:
//   1) count and write the number of symbols in every line.
//   2) find the longest and the shortest line.
//   3) find and write only that lines, which consist of word «var»


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/Task_11Praktice/Task3/myText.txt"));
            String text = sc.useDelimiter("\\A").next();
            sc.close();
            String[] arr = text.split("\\r");
            String longer = "" ;
            String shorter = "......................................................................................" ;
            String consistVar = null;
           for (int i = 0 ; i < arr.length;i++) {
               System.out.println(arr[i] + " [" + arr[i].length() + "] ");
              longer = (arr[i].length()>longer.length()) ? arr[i] : longer;
              shorter = (arr[i].length()<shorter.length()) ? arr[i] : shorter;
              consistVar = (arr[i].contains("var"))? arr[i] : null ;
           }
            System.out.println("\n The longest line is : " + longer + " [" + longer.length() + "] ");
            System.out.println("\n The Shorter line is : " + shorter + " [" + shorter.length() + "] ");
            System.out.println("\n The line witch contains <<var>>  : " + consistVar);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
