package l11HWQ1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static int readNumber(int start, int end) throws Exception {
		System.out.println("Please enter a  number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			if (n <= end && n >= start) {
				System.out.println(n + " is in range");
				return n;
			} else {
				System.out.println(n + " is NOT in range");
				return 0;
			}
		} catch (NumberFormatException e) {
			System.err.println(e + e.getMessage());
			return -1;
		} catch (IOException e) {
			System.err.println(e + e.getMessage());
			return -1;
		} catch (Exception e) {
			System.err.println(e + e.getMessage());
			return -1;
		}

	}

}
