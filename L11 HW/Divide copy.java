package l11HWQ1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide {

	public static double div() throws Exception {
		System.out.println("Please enter the numerator and denominator:\nnumerator\ndenominator");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			double num = Double.parseDouble(br.readLine());
			double denom = Double.parseDouble(br.readLine());
			System.out.println("The result is: " + num / denom);
			return num / denom;
		} catch (ArithmeticException e) {
			System.err.println(e + e.getMessage());
			return -1;
		} catch (NumberFormatException e) {
			System.err.println(e + e.getMessage());
			return -2;
		} catch (IOException e) {
			System.err.println(e + e.getMessage());
			return -3;
		} catch (Exception e) {
			System.err.println(e + e.getMessage());
			return -4;
		}
	}

}
