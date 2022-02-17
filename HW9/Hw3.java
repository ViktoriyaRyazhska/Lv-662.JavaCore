package hw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Введите значения:");
        String sum = br.readLine();
        String pattern = ("\\$\\d+\\.\\d{2}");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sum);
        while (m.find()) {
            System.out.println(sum.substring(m.start(), m.end()));
        }


    }
}