package HW12;
//1. There is a list of strings list1. Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)
//2. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//Method encrypt should take a string and return coded string where every letter is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value
//3. Create method to validate date according to format "mm.dd.yy"

import java.util.Arrays;
import java.util.stream.Collectors;

public class Encryption {
    public static void main(String[] args) {
        Encryption e = new Encryption();
        String codedStr = e.encrypt("abc", 3);
        System.out.println("coded str = " + codedStr);

        Encryption d = new Encryption();
        d.decryption(codedStr);

    }

    public String encrypt(String s, int n) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzabc";
        String[] strToArray = s.split("");
        String[] tempArr = new String[strToArray.length];
        for (int i = 0; i < strToArray.length; i++) {
            int x = alphabet.indexOf(strToArray[i]) + n;
            tempArr[i] = alphabet.substring(x, x + 1);
        }

        return Arrays.stream(tempArr).collect(Collectors.joining());
    }
    public void decryption(String s){
        int n = 3;
        String alphabet = "abcdefghijklmnopqrstuvwxyzabc";
        String[] strToArray = s.split("");
        String[] tempArr = new String[strToArray.length];
        for (int i = 0; i < strToArray.length; i++) {
            int x = alphabet.indexOf(strToArray[i]) - n;
            tempArr[i] = alphabet.substring(x, x + 1);
        }
        System.out.println("Decoded code = " + Arrays.stream(tempArr).collect(Collectors.joining()));
    }
}
