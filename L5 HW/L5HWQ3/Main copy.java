package l5HWQ3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = { 0, 1, 2, 3, 4};
		for (int i = 0; i < 5; ++i) {
			if (i == 0) {
				System.out.println("Please input the first number");
			} else {
				System.out.println("Please input the next number");
			}
			int x = Integer.parseInt(br.readLine());
			arr[i] = x;
		}
		SearchArr.getPositionOfPos(arr);
		SearchArr.getProduct(arr);
		SearchArr.minimum(arr);
		SearchArr.organize(arr);

	}

}
