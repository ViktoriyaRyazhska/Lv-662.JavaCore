import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void task4 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text");
        String str = sc.nextLine();
       str = str.toLowerCase(Locale.ROOT);
        int count = 0;
       char[] arr = str.toCharArray();
        char[] num = new char[]{'a','i','e','o','y','u'};
        char[] arr1 = str.toCharArray();
        for (int i = 0 ; i < str.length();i++) {
            for (int j = 0; j < num.length; j++) {
                if (arr[i] == num[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
