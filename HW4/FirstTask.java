package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FirstTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of month");

        int x = Integer.parseInt(br.readLine());

        System.out.println("Amount days in this month is: " + Month.getDays(x));

    }

    private class Month{
       static int []arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
   private static int getDays(int x){
       return arr[x-1];
   }
    }
}
