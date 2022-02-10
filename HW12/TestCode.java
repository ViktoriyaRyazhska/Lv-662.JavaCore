package HW12;

import java.util.Arrays;

public class TestCode {
    public static void main(String[] args) {
        String s = "abc";
        int n = 3;


        String alphabet = "abcdefghijklmnopqrstuvwxyzabc";
        String[] strToArray = s.split("");

        System.out.println("Arrays to string " + Arrays.toString(strToArray));

        String []tempArr = new String [strToArray.length];

        for (int i = 0; i < strToArray.length; i++) {
            int x = alphabet.indexOf(strToArray[i]) + n;
                tempArr[i] = alphabet.substring(x,x+1);

        }
        String codedStr = Arrays.toString(tempArr);
        System.out.println("Coded str = " + codedStr);
    }
}
