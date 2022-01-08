package Task_4HM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of
// last 5 element in the other case.

public class task4_2_tenIntegerNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tenInt = new int[10];
        tenInt[0] = Integer.parseInt(br.readLine());
        tenInt[1] = Integer.parseInt(br.readLine());
        tenInt[2] = Integer.parseInt(br.readLine());
        tenInt[3] = Integer.parseInt(br.readLine());
        tenInt[4] = Integer.parseInt(br.readLine());
        tenInt[5] = Integer.parseInt(br.readLine());
        tenInt[6] = Integer.parseInt(br.readLine());
        tenInt[7] = Integer.parseInt(br.readLine());
        tenInt[8] = Integer.parseInt(br.readLine());
        tenInt[9] = Integer.parseInt(br.readLine());

        int x = 0;
        boolean k = false;
        for (int i = 0; i < tenInt.length / 2; i++) {
            if (tenInt[i] >= 0) {
                x += tenInt[i];
            } else {
                x = tenInt[5];
                k = true;
                break;
            }
        }
        for (int i = 6; i < tenInt.length && k == true; i++){
            x *=tenInt[i];
        }
        System.out.println(x);
    }
}