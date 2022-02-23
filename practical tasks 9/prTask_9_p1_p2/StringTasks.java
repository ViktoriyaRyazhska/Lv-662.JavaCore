package prTask_9_p1_p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringTasks {
    public static void main(String[] args) throws IOException {

        //task 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text: IT");
        String s1 = br.readLine().toLowerCase();
        System.out.println("Enter text: IT Academy");
        String s2 = br.readLine().toLowerCase();

        boolean res = s2.contains(s1);

        System.out.println(res);


        //task 2

        System.out.println("Enter name: Ivanov Petro Petrovych");
        String s3 = br.readLine();
        int i = s3.length();
        System.out.println("String length = " + i);
        String s31 = s3.replace("etro Petrovych", ". P");
        System.out.println(s31);

        String s32 = s3.substring(7, 12);
        System.out.println(s32);

        String s33m = s3.substring(13, 22);
        String s33l = s3.substring(0, 6);
        System.out.println(s32 + " " + s33m + " " + s33l);


    }
}
