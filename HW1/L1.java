package lect1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1 {

	public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	int a = Integer.parseInt(br.readLine());
//	int b = Integer.parseInt(br.readLine());
	System.out.println("Please, enter the first number ");
	double a = Double.parseDouble(br.readLine());
	System.out.println("Please, enter the second number ");
	double b = Double.parseDouble(br.readLine());

	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	
	System.out.println("How are you?");
	String myMood = br.readLine();
	System.out.println("Your answer is " + myMood + "!");
	

	}

}
