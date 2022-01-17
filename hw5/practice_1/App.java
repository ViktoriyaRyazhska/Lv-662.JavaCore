package hw5.practice_1;

public class App {
	
	public static void main(String[] args) {
		
		Car[] myGarage = new Car[5];
		
		myGarage[0] = new Truck("Ford Explorer", 170, 2008);
		myGarage[1] = new Sedan("Pontiac Bonneville", 220, 2005);
		myGarage[2] = new Truck("Toyota Hilux", 190, 2018);
		myGarage[3] = new Sedan("Ford Escort", 160, 1995);
		myGarage[4] = new Truck("Mitsubishi L200", 200, 2010);
		
		for (Car car : myGarage) {
			System.out.println(car.toString());
		}
		
	}
	
}
