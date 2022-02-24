package hw9_t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first text of US currency");
        String text = br.readLine();
        System.out.println("Enter second text of US currency");
        String text1 = br.readLine();
        System.out.println("Enter third text of US currency");
        String text2 = br.readLine();



        String pattern = "^\\$(\\d*)(\\.\\d{2})$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        Matcher m1 = p.matcher(text1);
        Matcher m2 = p.matcher(text2);
        boolean res1 = m.matches();
        boolean res2 = m1.matches();
        boolean res3 = m2.matches();
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
