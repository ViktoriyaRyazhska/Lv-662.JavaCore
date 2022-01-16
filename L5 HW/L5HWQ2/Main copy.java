package l5HWQ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i = 0 ; i < 10 ; ++i) {
				if (i == 0) {
					System.out.println("Please input the first number");
				} else {
					System.out.println("Please input the next number");
				}
				int x = Integer.parseInt(br.readLine());
				arr[i] = x;
			}
		
		System.out.println("The result is: " + Calc.calcResult(arr));
	}

}
