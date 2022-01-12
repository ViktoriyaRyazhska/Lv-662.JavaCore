package l4HW;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1A {

	public static void main(String[] args) throws IOException {
		System.out.print("Please enter three numbers as follows:\nn1\nn2\nn3\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float n1 = Float.parseFloat(br.readLine());
		float n2 = Float.parseFloat(br.readLine());
		float n3 = Float.parseFloat(br.readLine());
		
		String retval = "All entered values are within range.";
		
		if (((n1 > 5) || (n1 < -5)) || 
			((n2 > 5) || (n2 < -5)) ||
			((n3 > 5) || (n3 < -5))) {
			retval = "One or more of the entered values are not within range.";
		}
		System.out.println(retval);
	}

}
