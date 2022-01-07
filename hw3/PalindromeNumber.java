package hw3;

public class PalindromeNumber {
	
static boolean isPalindrome(int x) {
	if (x < 0) return false;
	return x == ReverseInteger.reverse(x);
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(1234554321));
		
	}

}
