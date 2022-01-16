package l5HWQ4;

public class Appl {
	
	
	public static void printCars(Car[] cars) {
		for (int i = 0; i < cars.length; ++i)  {
			if(cars[i] == null) {
				break;
			}
			System.out.println("Car " + (i + 1) + ":");
			System.out.println("Type: " + cars[i].getType());
			System.out.println("Year: " + cars[i].getYear());
			System.out.println("Engine: " + cars[i].getEngine());
			System.out.println();
		}
	}
	
	
	public static Car[] getCarsofYear(int year, Car[] cars) {
		Car[] matches =  {null, null, null,null};
		int j =  0;
		for (int i = 0; i < cars.length; ++i)  {
			if(cars[i].getYear() == year) {
				matches[j] = cars[i];
			}
		}
		printCars(matches);
		return matches;
	}
	

	public static Car[] sortCars(Car[] cars) {
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				Car tmp;
				if (cars[i].getYear() > cars[j].getYear()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
		}
		printCars(cars);
		return cars;
		
//		Car[] sorted =  {null, null, null,null};
//		int j =  0;
//		for (int i = 0; i < cars.length; ++i)  {
//			if(cars[i].getYear() == year) {
//				matches[j] = cars[i];
//			}
//		}
//		printCars(matches);
//		return matches;
	}
}
