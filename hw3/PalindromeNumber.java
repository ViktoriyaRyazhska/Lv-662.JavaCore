package hw3;

public class PalindromeNumber {
	
static boolean isPalindrome(int x) {
	int a = x, b = 0;
	while (a > 0) {
		b = b * 10 + a % 10;
		a = a / 10;
	}
	return x == b;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(1254521));
		
	}

}
