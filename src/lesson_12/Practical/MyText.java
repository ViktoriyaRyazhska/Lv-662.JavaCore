package lesson_12.Practical;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.isLetter;
import static java.lang.constant.ConstantDescs.NULL;

public class MyText {
    public static void main(String[] args) {
        String fileName = "/Users/myroslavavynokur/Lv-662.JavaCore/src/text.txt";
        BufferedReader br = null;
        String s = null;
        int count = 0;
        int indexL = 0;
        int indexS = 0;

        ArrayList<String> LineList = new ArrayList<>();
        ArrayList<Integer> NumberOfChars = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                //Read context from file into array of strings
                LineList.add(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //count and write the number of symbols in every line.
        for (int i = 0; i < LineList.size(); i++) {
            NumberOfChars.add(LineList.get(i).replace(" ", "").length());
            count++;
            System.out.println("The number of symbols in line " + count + " is - " + NumberOfChars.get(i));
        }

        int largestString = NumberOfChars.get(0);
        for (int i = 0; i < NumberOfChars.size(); i++) {
            if (NumberOfChars.get(i) > largestString) {
                largestString = NumberOfChars.get(i);
                indexL = i + 1;
            }
        }
        System.out.println("The largest row has " + largestString + " symbols " + "and the number of row is " + indexL);

        int shortestString = NumberOfChars.get(0);
        for (int i = 0; i < NumberOfChars.size(); i++) {
            if (NumberOfChars.get(i) < shortestString || NumberOfChars.get(i) != 0) {
                shortestString = NumberOfChars.get(i);
                indexS = i + 1;
            }
        }
        System.out.println("The shortest row has " + shortestString + " symbols " + "and the number of row is " + indexS);

        //find and write only that lines, which consist of word «Sun»
        List<String> matches = new ArrayList<String>();
        for (String str : LineList) {
            if (str.contains("Sun")) {
                matches.add(str);
                System.out.println(matches);
            }
        }

    }

}










