package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeFloat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float[] floatArray = new float[3];
		System.out.print("Please enter first float number: ");
		floatArray[0] = Float.parseFloat(br.readLine());
		System.out.print("Please enter second float number: ");
		floatArray[1] = Float.parseFloat(br.readLine());
		System.out.print("Please enter third float number: ");
		floatArray[2] = Float.parseFloat(br.readLine());
		br.close();
		
		for (float f : floatArray) {
			if (f >= -5 && f <= 5) {
				System.out.println(f + " belongs to the range [-5,5]");
			} else {
				System.out.println(f + " does not belong to the range [-5,5]");
			}
		}
	}

	

}
