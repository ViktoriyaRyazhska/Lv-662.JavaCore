package hw3;

public class AdditionalTasks {
	
	//Implement power(x, n), which calculates x raised to the power n (i.e., x^n).
	
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
	
	/* Given a non-negative integer x, compute and return the square root of x.
	   Since the return type is an integer, the decimal digits are truncated, 
	   and only the integer part of the result is returned. */
	
	//static int mySqrt(int x) {
		
		
        
    //}



	public static void main(String[] args) {
		
		System.out.println(myPow(2, -1));

	}

}
