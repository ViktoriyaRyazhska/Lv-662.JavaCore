package hw4;

public class GroupTasks {
	
	// Task 01
	
	static int century(int year) {
	    
	    int century = (year % 100 == 0) ? year / 100 : year / 100 + 1;
	    
	    return century;
	    
	}
	
	// Task 12
	
	static double averageScore(double[] scores) {
		
		double max = scores[0];
		double min = scores[0];
		double sum = 0;
		
		for (double d : scores) {
			
			sum += d;
			
			if (d > max) max = d;
			
			if (d < min) min = d;
			
		}
		
		return (sum - max - min) / (scores.length - 2);
		
	}

	public static void main(String[] args) {
		
		double[] scores = {2.5, 3.4, 5.8, 1.3, 7.9};

		System.out.println(averageScore(scores));
		System.out.println(century(1379));
		
	}

}
