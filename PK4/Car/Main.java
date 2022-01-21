package java18;

public class Main {
public static void main(String[] args) {
		
		Car[] cars = new Car[4];
		cars[0] = new Truck();
		cars[0].model = "Gelendvagen";
		cars[0].maxSpeed = 300;
		cars[0].yearOfManufacture = 2021;
		cars[1] = new Truck();
		cars[1].model = "Maybach";
		cars[1].maxSpeed = 350;
		cars[1].yearOfManufacture = 2015;
		cars[2] = new Sedan();
		cars[2].model = "S class";
		cars[2].maxSpeed = 250;
		cars[2].yearOfManufacture = 2017;
		cars[3] = new Sedan();
		cars[3].model = "I8";
		cars[3].maxSpeed = 250;
		cars[3].yearOfManufacture = 2019;
		
		

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
