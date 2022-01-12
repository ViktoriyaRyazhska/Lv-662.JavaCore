package l4HW;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1B {

	public static void main(String[] args) throws IOException {
		System.out.print("Please enter three integers as follows:\nn1\nn2\nn3\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		
		int max;
		int min;
		
		max = Math.max(Math.max(n1, n2), n3);
		min = Math.min(Math.min(n1, n2), n3);
		
		System.out.println("The maximum is:" + max);
		System.out.println("The minimum is:" + min);
	}

}
