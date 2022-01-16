package l5HWQ2;

public class Calc {

	public static int calcResult(int[] arr) {

		int sum = 0;
		int prod = 1;

		for (int i = 0; i < 10; ++i) {
			int num = arr[i];
			if (i < 5) {
				if (num >= 0) {
					sum += num;
				} else {
					for (int j = 5; j < 10; ++j) {
						prod *= arr[j];
					}
					return prod;
				}
			} 
		}
		return sum;
	}
}
