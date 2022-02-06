package l10HWQ3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a sentence with instances of american currency is the following format: $x.xx");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		String pattern = "\\$(\\d*)(\\.\\d{2})?";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			System.out.print(sentence.substring(m.start(), m.end()) + "*");
		}
	}
}
