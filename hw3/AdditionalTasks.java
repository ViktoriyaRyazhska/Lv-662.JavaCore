package hw3;

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

	public static void main(String[] args) {
		
		System.out.println(myPow(2, -1));
		System.out.println(mySqrt(30));
		System.out.println(convertToTitle(27));

	}

}
