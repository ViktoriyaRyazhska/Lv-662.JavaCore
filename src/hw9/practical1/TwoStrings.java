package hw9.practical1;

import java.util.Scanner;

public class TwoStrings {
    public static boolean isASubstring(String str1, String str2) {
        return str1.equals(str2.substring(0, str1.length()));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Determine whether the first variable substring second");
        System.out.println("Please enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Please enter second string:");
        String str2 = scanner.nextLine();
        System.out.println(isASubstring(str1, str2));

    }
}