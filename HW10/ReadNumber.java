package HW10;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
        int start = 3;
        int end = 8;

        try {
            readNumber(start, end, line);
        } catch (NumberFormatException e) {
            System.out.println("Not a number in the entered list");
        }

    }

    public static void readNumber(int start, int end, String line) throws NumberFormatException {
        String[] wordToArr = line.split(" ");
        int[] intArr = new int[wordToArr.length];
        for (int i = 0; i < wordToArr.length; i++) {
            intArr[i] = Integer.parseInt(wordToArr[i]);
        }
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == start) {
                for (int x = i; intArr[x] != end && intArr[x] < intArr.length; x++) {
                    System.out.println(intArr[x]);
                }
            }
        }
    }
}
