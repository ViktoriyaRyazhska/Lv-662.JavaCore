package l5HWQ4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Car[] cars = {null, null, null, null};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 4; ++i) {
			Car temp = new Car();
			System.out.println("Please enter the type of car " + (i + 1));
			temp.setType(br.readLine());
			System.out.println("Please enter the year of car " + (i + 1));
			temp.setYear(Integer.parseInt(br.readLine()));
			System.out.println("Please enter the engine of car " + (i + 1));
			temp.setEngine(Integer.parseInt(br.readLine()));
			cars[i] = temp; 
		}
		
		Appl.sortCars(cars);
		Appl.printCars(cars);

	}
}
