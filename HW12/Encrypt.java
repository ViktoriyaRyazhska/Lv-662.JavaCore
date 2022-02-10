package Lecture13;

public class Encrypt {

	public static String encrypt(String s, int n) {
		n = 3;
		char[] chars = s.toCharArray();
		for(char c : chars) {
			c += n;
			System.out.println(c);
		}
		return s;
	}
	public static String decrypt(String s, int n) {
		n = 3;
		char[] chars = s.toCharArray();
		for(char c : chars) {
			c -= n;
			System.out.println(c);
		}
		return s;
	}

	public static void main(String[] args) {

		String s = "abc";
		int n = 0;
		String j = "def";

		System.out.println(encrypt(s, n));
		System.out.println(decrypt(j, n));

	}

}