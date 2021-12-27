package lesson_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone_calls {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Please, enter the value per minute to UK, in $. " );
	double x = Integer.parseInt(br.readLine());
	System.out.print("Value per minute to UK is " + x + "$. Please, enter the duration of conversation - " );
	double a = Integer.parseInt(br.readLine());
	System.out.print("Final sum is ");
	System.out.println (x*a +"$");
	System.out.println();

	System.out.print("Please, enter the value per minute to USA, in $. " );
	double z = Integer.parseInt(br.readLine());
	System.out.print("Value per minute to USA is " + z + "$. Please, enter the duration of conversation - " );
	double b = Integer.parseInt(br.readLine());
	System.out.print("Final sum is ");
	System.out.println (z*b +"$");
	System.out.println();
	
	System.out.print("Please, enter the value per minute to Mexico, in $. " );
	double y = Integer.parseInt(br.readLine());
	System.out.print("Value per minute to USA is " + z + "$. Please, enter the duration of conversation - " );
	double c = Integer.parseInt(br.readLine());
	System.out.print("Final sum is ");
	System.out.println (y*c +"$");
	System.out.println();
	
	System.out.print("Total payment is equal " );
	System.out.print(x*a + z*b + y*c +"$");
  }

}
