package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdTask {


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers ");

        int arr[] = new int[5];
       a: for(int x = 0; x< arr.length;x++){
           arr[x] = Integer.parseInt(br.readLine());
            if(arr[x]<0){
              break a;
            }
        }

        int count = 0;
        int pos = 0;
        int min = arr[0];
        int mPos = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                count++;
                if(count==2){
                    pos = i+1;
                }
            }
            if(arr[i]<min){
                min = arr[i];
                mPos = i+1;
            }
            if(arr[i] % 2 == 0) product *= arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Position of second positive number is " + pos);
        System.out.println("Minimum number is " + min + " its position is " + mPos);
        System.out.println("Product of all even numbers is " + product);
    }
}
