package l7;

public class Main {

	public static void main(String[] args) {
		
		Car[] cars = new Car[5];
		cars[0] = new Truck();
		cars[0].model = "Scania";
		cars[0].maxSpeed = 220;
		cars[0].yearOfManufacture = 2008;
		cars[1] = new Truck();
		cars[1].model = "IVECO";
		cars[1].maxSpeed = 250;
		cars[1].yearOfManufacture = 2018;
		cars[2] = new Sedan();
		cars[3] = new Sedan();
		cars[3].model = "Mazda";
		cars[3].maxSpeed = 180;
		cars[3].yearOfManufacture = 2013;
		cars[4] = new Sedan();
		cars[4].model = "Lanos";
		cars[4].maxSpeed = 130;
		cars[4].yearOfManufacture = 2003;
		
		

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
