package l13HWQ2;

public class Methods {

	public static String encrypt(String s, int n) {
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length; ++i)  {
			char x = chars[i];
			chars[i] += x >= ('z' - n + 1) ? (n - 26) : n;
		}
		String retval = new String(chars);
		return retval;
	}

	public static String decrypt(String s, int n) {
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length; ++i)  {
			char x = chars[i];
			chars[i] -= x < ('a' + n) ? (n - 26) : n;
		}
		String retval = new String(chars);
		return retval;
	}
}
