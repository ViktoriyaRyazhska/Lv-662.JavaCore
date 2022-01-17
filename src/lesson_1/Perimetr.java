package lesson_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perimetr {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Please enter the radius");
	
	double r = Integer.parseInt(br.readLine()); 
	double p = Math.PI;
	
		
	System.out.println("The area calculation:");
	System.out.println(p * r * r);

	System.out.println("The perimeter calculation:");
	System.out.println(2*p*r);
	
}
}