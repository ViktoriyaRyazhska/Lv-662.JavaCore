package HW11;
import java.io.*;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String HMText = "src/HW11/file1.txt";
        int count = 0;
        String longestLine = ".";
        String nameAndBirthday = " Sergiy 19.10.2000";
        try {
            BufferedReader br = new BufferedReader((new FileReader(HMText)));
            String s;
            for (int i = 0; (s = br.readLine()) != null; i++, count++) {
                System.out.println((i + 1) + ". " + s);
            }
            String[] arr = new String[count];
            br = new BufferedReader((new FileReader(HMText)));
            for (int i = 0; i < arr.length; i++) {
                arr[i] = br.readLine();
                longestLine = (longestLine.length() < arr[i].length()) ? arr[i] : longestLine;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        String fileName = "file2.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            System.out.println("Write data to file : " + fileName);
            Integer.toString(count);
            bw.write("Number of lines : ");
            bw.write(Integer.toString(count));
            bw.write("\n");
            bw.write("Longest line : ");
            bw.write(longestLine);
            bw.write("\n");
            bw.write("My name and birthday : ");
            bw.write(nameAndBirthday);
            bw.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
