package Task_4_AdditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter A");
        int A = Integer.parseInt(br.readLine());
        System.out.println("enter B");
        int B = Integer.parseInt(br.readLine());
        System.out.println("enter C");
        int C = Integer.parseInt(br.readLine());

        if ((A==B && A!=C && C<A+B) || (B==C && B!=A && A<B+C) || (C==A && C!=B && C<A+B)){
            System.out.println(2);
        }else if (A==B && A==C){
            System.out.println(3);
        }else if (A<B+C && C<A+B && B<C+A){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
