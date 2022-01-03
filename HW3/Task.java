package l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
	
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first number");
	int x = Integer.parseInt(br.readLine());
	
	System.out.println("Enter the second number");
	int y = Integer.parseInt(br.readLine());
	
	System.out.println("Enter the third number");
	int k = Integer.parseInt(br.readLine());
	
	int count = 0;
	if (x % 2 == 0)
		count++;
	if (y % 2 == 0)
		count++;
	if (k % 2 == 0)
		count++;
	
	
	
	System.out.println("Odd number is " + count);
	
	}
}
