package Lecture14;


import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		int count = 0;
		Random random = new Random();
		count = (int)random.ints(0, 2).limit(5).filter(n -> n == 1).count();
		
		System.out.println(count);
		

	}

}
