package l10HWQ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a sentence with multiple spaces between words");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		StringBuilder str = new StringBuilder();
		char[] chars = sentence.toCharArray();

		for (int i = 0; i < chars.length; ++i) {
			if (chars[i] != ' ') {
				str.append(chars[i]);
			} else {
				str.append(' ');
				for (int j = i; j < chars.length; ++j) {
					if (chars[j] != ' ') {
						i = j - 1;
						break;
					}
				}
			}

		}
		System.out.println(str);
	}
}
