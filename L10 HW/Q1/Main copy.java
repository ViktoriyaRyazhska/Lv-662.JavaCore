package l10HWQ1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a sentence with 5 words in the form of a string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();

		char[] chars = sentence.toCharArray();

		int word = 1;
		int longestStart = 0;
		int longestEnd = 1;
		int longestLength = 0;
		int letterCount = 0;

		for (int i = 0; i < chars.length; ++i) {
			if ((chars[i] == ' ' || i == chars.length - 1)) {
				if (word == 1) {
					longestEnd = i - 1;
					longestLength = longestEnd - longestStart;
					letterCount = longestLength + 2;
				}
				++word;
				for (int j = i + 1; j < chars.length; ++j) {
					if ((chars[j] == ' ' || j == chars.length - 1)) {
						letterCount += j - i - 1;
						if (j == chars.length - 1 && (j - i) >= longestLength) {
							longestStart = i + 1;
							longestEnd = j;
							longestLength = longestEnd - longestStart;
						}
						if ((j - 1 - i) >= longestLength) {
							longestStart = i + 1;
							longestEnd = j - 1;
							longestLength = longestEnd - longestStart;
						}
						i = j - 1;

						if (word == 2) {
							System.out.print("The second word reversed is: ");
							for (int x = j - 1; x > 0; --x) {
								if (chars[x] == ' ') {
									break;
								}
								System.out.print(chars[x]);
							}
							System.out.println();
						}
						break;
					}
				}

			}

		}

		System.out.println("The longest word is: " + sentence.substring(longestStart, longestEnd + 2));
		System.out.println("The number of letters is: " + letterCount);

	}

}

