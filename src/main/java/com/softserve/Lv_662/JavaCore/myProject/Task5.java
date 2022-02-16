package com.softserve.Lv_662.JavaCore.myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        System.out.println("Enter word to check is it palindrome");
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        isPalindrome(input);

    }
    public static void isPalindrome(String input){
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j))
                System.out.println("Word is not a palindrome");  ;
            i++;
            j--;
        }
        System.out.println("Word is a palindrome");;
    }
}
