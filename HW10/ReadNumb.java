package Lecture11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumb {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int readNumber(int start, int end) throws NumberFormatException, ArithmeticException, IOException {
		int a = Integer.parseInt(br.readLine());
		if (a > start && a < end) {
			System.out.println(a);
		} else if (a < start && a > end) {
			throw new ArithmeticException();
		} else {
			throw new NumberFormatException();
		}
		return a;
	}

}
