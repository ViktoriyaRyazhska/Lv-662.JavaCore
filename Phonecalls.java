package HWQ1;
import java.util.Scanner;

public class Phonecalls {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the the values as follows:\nc1\nc2\nc3\nt1\nt2\nt3");
		double c1 = input.nextInt();
		double c2 = input.nextInt();
		double c3 = input.nextInt();
		double f1 = input.nextInt();
		double f2 = input.nextInt();
		double f3 = input.nextInt();
		double call_1_total = c1 * f1;
		double call_2_total = c2 * f2;
		double call_3_total = c3 * f3;
		System.out.printf("Call one: %f\n", call_1_total);
		System.out.printf("Call two: %f\n", call_2_total);
		System.out.printf("Call three: %f\n", call_3_total);
		System.out.printf("Total: %f\n", call_1_total + call_2_total + call_3_total);
	}

}
