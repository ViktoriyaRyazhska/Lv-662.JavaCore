package HW9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentences = sc.nextLine();
        StringMethod.longestWord(sentences);

        //StringMethod.reverseSecondWord(sentences);

        //StringMethod.deleteSpace();

        String currency = sc.nextLine();
        String testString = "Something to test $3.32";

        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(currency);

        while(m.find()) {
            System.out.println(currency.substring(m.start(), m.end()));
        }

        Matcher n = p.matcher(testString);
        while(n.find()) {
            System.out.println(testString.substring(n.start(), n.end()));
        }
    }
}

