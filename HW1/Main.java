package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Print 1st num");
        int num_1 = Integer.parseInt(br.readLine());
        System.out.println("Print 2st num");
        int num_2 = Integer.parseInt(br.readLine());
        System.out.println(num_1+num_2);
        System.out.println(num_1-num_2);
        System.out.println(num_1*num_2);
        System.out.println(num_1/num_2);
        System.out.println("How are you");
        String answer = br.readLine();
        System.out.println("You are "+answer);

    }
}
