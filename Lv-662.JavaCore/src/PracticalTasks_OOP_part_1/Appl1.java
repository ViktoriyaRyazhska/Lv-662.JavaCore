package PracticalTasks_OOP_part_1;

//

public class Appl1 {

	public static void main(String[] args) {

		Car[] cars = new Car[4];

		cars[0] = new Truck("Ford", 120, 2009, 8);
		

		cars[1] = new Sedan("Skoda", 240, 2016, "yellow");
		

		cars[2] = new Truck("MAN", 160, 2020, 16);
		

		cars[3] = new Sedan("BMW 118i", 320, 2021, "grey mettalic");
	

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			cars[i].run();
			//cars[i].stop();
			
		}

	}

}
