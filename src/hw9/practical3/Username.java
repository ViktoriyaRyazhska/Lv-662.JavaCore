package hw6.hw9.practical3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
    private static final Pattern p = Pattern.compile("[a-zA-Z0-9_]{3,15}");
    public static void validation(String s) {
        Matcher m = p.matcher(s);
        if (m.matches()) {
            System.out.println(s + ": Your name is valid");
        } else {
            System.out.println(s + ": Your name is not valid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();
            validation(name);
        }
    }
}


