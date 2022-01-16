package l5HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		System.out.println("Please enter the number of the month");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int days = Calc.giveDays(m);
		
		if(days == 0) {
			return;
		} else {
		System.out.println("The number of days in the entered month is: " + days);
		}

	}

}
