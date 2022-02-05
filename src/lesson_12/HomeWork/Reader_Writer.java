package lesson_12.HomeWork;

import java.io.*;
import java.util.ArrayList;

//Create file1.txt file with a text about your career.
//Read context from file into array of strings. Each array item contains one line from file.
//Write in to the file2.txt
//   1) number of lines in file1.txt.
//   2) the longest line in file1.txt.
//   3) your name and birthday date.

public class Reader_Writer {
    public static void main(String[] args) {
        String fileName = "/Users/myroslavavynokur/Lv-662.JavaCore/src/lesson_12/HomeWork/file1.txt";
        String fileNameTwo = "/Users/myroslavavynokur/Lv-662.JavaCore/src/lesson_12/HomeWork/file2.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String s = null;
        int count = 0;

        ArrayList<String> LineList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(fileName));
            bw = new BufferedWriter(new FileWriter(fileNameTwo));
            while ((s = br.readLine()) != null) {
                LineList.add(s);
                ++count;
                //   System.out.println("row " + ++count + " read:" + s);

                int largestString = LineList.get(0).length();
                for (int i = 0; i < LineList.size(); i++) {  // Test which String is the largest
                    if (LineList.get(i).length() > largestString) {
                        largestString = LineList.get(i).length();
                    }
                    bw.write("number of lines in file1.txt is "
                            + count + "\n" + "the longest line in file1.txt " + LineList.get(i)
                            + "My name is Myroslava, and BD is on 25th of July");
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
