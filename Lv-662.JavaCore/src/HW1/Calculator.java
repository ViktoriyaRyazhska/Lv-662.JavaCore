package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a:");
		double a = Integer.parseInt(br.readLine());
		System.out.println("b:");
		double b = Integer.parseInt(br.readLine());

		double sum = a + b;
		double sub = a - b;
		double mul = a * b;
		double div = a / b;

		System.out.println("a + b =	" + sum);
		System.out.println("a - b =	" + sub);
		System.out.println("a * b =	" + mul);
		System.out.println("a / b =	" + div);
	}
}
