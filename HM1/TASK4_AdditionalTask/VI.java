package Task_4_AdditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        int[] a = new int[4];
        System.out.println("Enter first number of matrix");
        a[0] = Integer.parseInt(br.readLine());
        System.out.println("Enter second number of matrix");
        a[1] = Integer.parseInt(br.readLine());
        System.out.println("Enter third number of matrix");
        a[2] = Integer.parseInt(br.readLine());
        System.out.println("Enter fourth number of matrix");
        a[3] = Integer.parseInt(br.readLine());
        System.out.println(" The value is " + VI.number(a));
    }

    private static int number(int[] a) {
        int x = 0;
        if (a[0] != a[1] && a[0] != a[2] && a[0] != a[3]) {
            x = 1;
        } else if (a[1] != a[0] && a[1] != a[2] && a[1] != a[3]) {
            x = 2;
        } else if (a[2] != a[0] && a[2] != a[1] && a[2] != a[3]) {
            x = 3;
        } else {
            x = 4;
        }
        return x;
    }
}
