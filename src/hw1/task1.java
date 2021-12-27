package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double pi = 3.14;
		
		System.out.println("This program wll calculate perimeter and area pf the flower bed by entering the radius. \n");
		System.out.printf("Please enter radius: ");
		double r = Integer.parseInt(br.readLine());
        
		System.out.printf("\nPerimetr of the flower bed (C): ");
		System.out.println(pi * (2 * r));
		System.out.printf("Area of the flower bed (A): ");
		System.out.println(pi * (r * r));
	}
}
