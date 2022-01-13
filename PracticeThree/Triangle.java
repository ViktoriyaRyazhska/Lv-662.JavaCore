package PracticeThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter three numbers");

        Integer a = Integer.parseInt(br.readLine());
        Integer b = Integer.parseInt(br.readLine());
        Integer c = Integer.parseInt(br.readLine());

        System.out.println(TriangleCheck.triangleCheck(a,b,c));
    }
}
