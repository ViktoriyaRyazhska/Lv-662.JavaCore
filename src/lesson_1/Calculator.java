package lesson_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("\"Please add numbers for sum calcluation\"");
	    
	    double a = Integer.parseInt(br.readLine()); 
	    double b = Integer.parseInt(br.readLine());
	    System.out.println(a + b);
	    
	    System.out.println("\"Please add numbers for subtraction calculation\"");
	    double c = Integer.parseInt(br.readLine()); 
	    double d = Integer.parseInt(br.readLine());
	    System.out.println(c - d);
	    
	    System.out.println("\"Please add numbers for multiplication calculation\"");
	    double e = Integer.parseInt(br.readLine()); 
	    double f = Integer.parseInt(br.readLine());
	    System.out.println(e * f);

	    
	    System.out.println("\"Please add numbers for division calculation\"");
	    double g = Integer.parseInt(br.readLine()); 
	    double k = Integer.parseInt(br.readLine());
	    System.out.println(g / k);

}
}
