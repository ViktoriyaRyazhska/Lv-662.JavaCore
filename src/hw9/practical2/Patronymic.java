package hw9.practical2;
import java.util.regex.*;

public class Patronymic {
    public static void main(String[] args) {
        String name = "Kruts Oleg Bogdanovych";
        String onlyName = null;

        // surnames and initials
        String pattern1 = "(^\\w+)*(\s[A-Z])";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(name);
        System.out.println("Print surname and initials: ");
        while (m1.find()) {
            System.out.print(name.substring(m1.start(), m1.end()) + ".");
        }

        // name
        String pattern2 = "(\s\\w+\s)";
        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(name);
        System.out.println("\nPrint name: ");
        while (m2.find()) {
            onlyName = (name.substring(m2.start(), m2.end()));
        }
        assert onlyName != null;
        System.out.println(onlyName.replaceAll("\\s",""));

        // name, middle name and last name
        System.out.println("Print name, middle name and last name: ");
        String[] words = name.split(" ");
        System.out.println(words[1] + " " + words[2] + " " + words[0]);
    }
}
