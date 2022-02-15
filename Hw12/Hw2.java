package java8;

public class Hw2 {

	public static String encrypt(String s, int n) {
		n = 5;
		char[] ch = s.toCharArray();
		for(char c : ch) {
			c += n;
			System.out.println(c);
		}
		return s;
	}
	public static String decrypt(String s, int n) {
		n = 5;
		char[] ch = s.toCharArray();
		for(char c : ch) {
			c -= n;
			System.out.println(c);
		}
		return s;
	}
	public static void main(String[] args) {

		String s = "Alexa";
		int n = 0;
		String z = "Fqj}f";
		System.out.println(encrypt(s, n));
		System.out.println(decrypt(z, n));

	}

}