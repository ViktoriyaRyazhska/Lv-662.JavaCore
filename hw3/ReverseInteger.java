package hw3;

public class ReverseInteger {
	
	static int reverse(int x) {
		int sign = 1;
		if (x < 0) {
			x *= -1;
			sign = -1;
		}
		int a = x, b = 0;
		while (a > 0) {
			b = b * 10 + a % 10;
			a = a / 10;
		}
		return sign * b;
    }

	public static void main(String[] args) {

		System.out.println(reverse(-12345));
	}

}
