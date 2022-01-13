package Task_4_AdditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class XI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] c = new int[n];
        int x = 0;
        for(int i = 0; i < t.length; i++){
         t[i] = Integer.parseInt(br.readLine());
         x += t[i];
         c[i] = x;
        }
        System.out.println(" service time " + Arrays.toString(c));
        x = 0;
        for (int i = 0;i < t.length;i++){
            x = (x<t[i])?i:x;
        }
        System.out.println("the number of the buyer whose service time was the shortest " + x);
    }
}
