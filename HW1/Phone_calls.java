package Lesson_1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone_calls {
	  public static void main(String[] args) throws IOException {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Value per minute to UK is 1,2$. Please, enter the duration of conversation - " );
		double a = Integer.parseInt(br.readLine());
		System.out.print("Final sum is ");
		System.out.println (1.2*a +"$");
		System.out.println();
	
		System.out.print("Value per minute to USA is 1,5$. Please, enter the duration of conversation - " );
		double b = Integer.parseInt(br.readLine());
		System.out.print("Final sum is ");
		System.out.println (1.5*b +"$");
		System.out.println();
		
		System.out.print("Value per minute to USA is 2,3$. Please, enter the duration of conversation - " );
		double c = Integer.parseInt(br.readLine());
		System.out.print("Final sum is ");
		System.out.println (2.3*c +"$");
		System.out.println();
		
		System.out.print("Total payment is equal " );
		System.out.print(1.2*a + 1.5*b + 2.3*c +"$");
	  }
	  }
