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
        int countLines = 0;
        int count = 0;

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
        // count rows
        for (int i = 0; i < LineList.size(); i++) {
            countLines++;
        }
        //convert rows from LineList to NumberOfChars (rows without spaces)
        for (int i = 0; i < LineList.size(); i++) {
            NumberOfChars.add(LineList.get(i).replace(" ", "").length());
        }
        // find the largest row in List (without spaces)
        int largestString = NumberOfChars.get(0);
        int indexL = 0;
        int index = 0;
        for (int i = 0; i < NumberOfChars.size(); i++) {
            if (NumberOfChars.get(i) > largestString) {
                largestString = NumberOfChars.get(i);
                indexL = i + 1;
                index = i;
            }
        }

        try {
            bw = new BufferedWriter(new FileWriter(fileNameTwo));
            bw.write("The number of lines in file1.txt " + String.valueOf(countLines));
            bw.write("\n" + "The longest line in file1.txt. is " + String.valueOf(indexL)
                    + ": " + LineList.get(index));
            bw.write("\nMy name is Myrosia and my BD is on July, the 25th");

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

