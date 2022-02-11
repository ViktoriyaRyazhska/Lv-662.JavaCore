package Task_12HM.Task2;

//2. Create two methods String encrypt(String s, int n) and String decrypt(String s, int n)
//Method encrypt should take a string and return coded string where every letter is moved on n positions in alphabet
// (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class methods {


    public static String encrypt(String s, int n) {
        char[] alphabet = s.toCharArray();
        char[] convertString = new char[alphabet.length];
        char c;
        int z = 0;
        for (int i = 0 ; i < alphabet.length ; i++ ){
            c = alphabet[i];
            if(z < n) {
                convertString[i] = ++alphabet[i];
            }
        }
        s = Arrays.toString(convertString);
        s = s.replaceAll(",","");
        return s;
    }


    public static String decrypt (String s , int n ){
        char[] alphabet = s.toCharArray();
        char[] convertString = new char[alphabet.length];
        char c;
        int z = 0;
        for (int i = 0 ; i < alphabet.length ; i++ ){
            c = alphabet[i];
            if(z < n) {
                convertString[i] = alphabet[i] --;
            }
        }
        s = Arrays.toString(convertString);
        s = s.replaceAll(",","");
        return s;

    }
}





