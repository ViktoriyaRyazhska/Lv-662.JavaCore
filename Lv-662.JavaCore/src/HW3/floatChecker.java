package HW3;

//read 3 float numbers and check: are they all belong to the range [-5,5];

public class floatChecker {
	public static int count = 0;

	public  void checkIfIsSuitable(float x) {
		
		if (x >= -5 && x <= 5) {
			count++;
		}
	}
}