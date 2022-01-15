package l7;

public class Truck extends Car {
	
	int speed;
	int hours;
	int pause;

	@Override
	public double run() {
		return speed * hours;
	}

	@Override
	public double stop() {
		return pause;
	}

	@Override
	public String toString() {
		return "Truck [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}
	
	
	

}
