package hw1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Please enter the radius of the flower bed: ");
		int radius = Integer.parseInt(br.readLine());
		System.out.println("The circumference is " + 2*Math.PI*radius);
		System.out.println("The area is " + Math.PI*radius*radius);

		System.out.print("What is your name? ");
		String name = br.readLine();
		System.out.print("Where are you live, " + name + "? ");
		String address = br.readLine();
		System.out.println(name + " lives in " + address);
		
		System.out.print("Please enter tariff per minute for country 1: ");
		int c1 = Integer.parseInt(br.readLine());
		System.out.print("Please enter tariff per minute for country 2: ");
		int c2 = Integer.parseInt(br.readLine());
		System.out.print("Please enter tariff per minute for country 3: ");
		int c3 = Integer.parseInt(br.readLine());
		System.out.print("Please enter number of minutes used in country 1: ");
		int t1 = Integer.parseInt(br.readLine());
		System.out.print("Please enter number of minutes used in country 2: ");
		int t2 = Integer.parseInt(br.readLine());
		System.out.print("Please enter number of minutes used in country 3: ");
		int t3 = Integer.parseInt(br.readLine());
		System.out.println("Total costs for country 1: " + c1*t1);
		System.out.println("Total costs for country 2: " + c2*t2);
		System.out.println("Total costs for country 3: " + c3*t3);
		System.out.println("Total costs for all countries: " + (c1*t1+c2*t2+c3*t3));
			
	}

}
