package hw3;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionalTasks {
	
	// Implement power(x, n), which calculates x raised to the power n (i.e., x^n).
	
	static double myPow(double x, int n) {
		
		int power = Math.abs(n);
		double answer = 1;
		
		if (n == 0) return answer;
		
		while (power != 0) {
			
			answer *= x;
			power -= 1;
			
		}
		
		if (n > 0) return answer;
		
		return 1/answer;
        
    }
	
	// Given a non-negative integer x, compute and return the square root of x.
	   	
	static double mySqrt(int x) {
		
		double guess = 0;
		
		double root = x / 2; 
		
		while (guess != root) {
			
			guess = root;
			root = (guess + x / guess) / 2;
			
		} 
		
		return root;
						        
    }
	
	// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

	static String convertToTitle(int columnNumber) {
     
		int number = columnNumber;
		StringBuilder title = new StringBuilder();
		
		while (number > 0) {
			
			number --;
			title.insert(0, (char) (65 + number % 26));
			number /= 26;
			
		}
		
		return title.toString();
		
    }
	
	/* 
	  Given a string s representing a valid expression, implement a basic calculator to evaluate it,
	  and return the result of the evaluation.
	*/
	
	static int calculate(String s) {
		
		String stripped = s.replace(" ", "");
		System.out.println("original: " + stripped);
		Pattern pattern = Pattern.compile("[(][^()]+[)]");
				
		while (stripped.contains("(")) {
			
			Matcher matcher = pattern.matcher(stripped);
			matcher.find();
			String foundString = stripped.substring(matcher.start(), matcher.end());
			System.out.println("parentheses found: " + foundString);
			System.out.println("evaluating found..." + evaluateString(foundString.replaceAll("[()]", "")));
			stripped = stripped.replace(foundString, evaluateString(foundString.replaceAll("[()]", "")));
			System.out.println("simplified to: " + stripped);
		
		}
		        
		return Integer.parseInt(evaluateString(stripped));
		
    }
	
	// This method evaluates string which consists of "+", "-", and digits ONLY.
	
	static String evaluateString(String s) {
		
		int result = 0;
		String edited = s.replace("+-", "-").replace("--", "+");
		
		Pattern pattern = Pattern.compile("[+-]*\\d+");
		Matcher matcher = pattern.matcher(edited);
		
		while (matcher.find()) {
		
			result += Integer.parseInt(edited.substring(matcher.start(), matcher.end()));
		
		}
		
		return String.valueOf(result);
		
	}

	public static void main(String[] args) {
		
		System.out.println(myPow(2, -1));
		System.out.println(mySqrt(30));
		System.out.println(convertToTitle(27));
		System.out.println("( - 2) + (3-(5+5)) = " + calculate("( - 2) + (3-(5+5))"));

	}

}
