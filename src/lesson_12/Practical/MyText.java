package lesson_12.Practical;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyText {
    public static void main(String[] args) {
        String fileName = "/Users/myroslavavynokur/Lv-662.JavaCore/src/text.txt";
        BufferedReader br = null;
        String s = null;
        int count = 0;
        int index = 0;

        ArrayList<String> LineList = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                //Read context from file into array of strings
                LineList.add(s);
                //convert each string to characters
                char[] a = s.toCharArray();
                //count number of characters if they are not null
                for (int i = 0; i < a.length; i++) {
                    if ((int) a[i] != 0) {
                        count++;
                    }
                }
                //find the longest line
                int largestString = LineList.get(0).length();
                for (int i = 0; i < LineList.size(); i++) {  // Test which String is the largest
                    if (LineList.get(i).length() > largestString) {
                        largestString = LineList.get(i).length();
                        index = i;
                    }
                    System.out.println("Row " + index + "is the largest and is size " + largestString + ": " + LineList.get(index));
                }
                //find the shortest line
                int shortestString = LineList.get(0).length();
                for (int i = 0; i < LineList.size(); i++) {
                    if (LineList.get(i).length() < shortestString) {
                        largestString = LineList.get(i).length();
                        index = i;
                    }
                    System.out.println("Row " + index + "is the shortest and is size " + shortestString + ": " + LineList.get(index));
                }

                System.out.println();
                //count and write the number of symbols in every line
                System.out.println(" The number of chars in line: " + s + " " + count);
                System.out.println();
                // find and write only that lines, which consist of word «Sun»
                String pattern = ("Sun");
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(s);

                while (m.find()) {
                    System.out.println(s.substring(m.start(), m.end()));
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
