package Schema;

import java.util.Arrays;

public class MainPassengers {
	
	public static void main (String[] args) {
		
		Passengers[] passengers = new Passengers[7];
		passengers[0] = new Liner();
		passengers[1] = new Boat();
		passengers[2] = new Plane();
		passengers[3] = new Helicopter();
		passengers[4] = new Bus();
		passengers[5] = new Motorcycle();
		passengers[6] = new Car();
		
		for (int i = 0; i < passengers.length; i++) {
			System.out.println(passengers[i]);
		}
	}

	
}