package hw6.hw9.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    private static final Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");

    public static void currency(String s) {
        Matcher m = p.matcher(s);
        if (m.matches()) {
            System.out.println(s + ": Currency is valid");
        } else {
            System.out.println("Please enter valid currency in the following format - $100.00");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter US currency: ");
        String s = scanner.nextLine();
        currency(s);
    }
}
