package hw3_liuda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        float a = 0;
        checking(br, a, 5);
        findMaxMin(br);

    }

    public static void checking(BufferedReader br, float a, int range) throws IOException {
        System.out.println("Enter float number a and check it");
        a = Float.parseFloat(br.readLine());

        if (a >= -range & a <= range) {
            System.out.println("Number a belongs to range -5,+5");
        } else
            System.out.println("Number a doesn't belong to range -5, +5");
    }

    private static void findMaxMin(BufferedReader br) throws IOException {
        System.out.println("Enter three integer numbers");
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());


        int max = Math.max(Math.max(b, c), d);
        int min = Math.min(Math.min(b, c), d);

        System.out.println("Max number is " + max);
        System.out.println("Max number is " + min);

    }

}


