package l7;

public class Sedan extends Car {
	
	int speed = 90;
	int hours = 5;
	int pause = 2;

	@Override
	public double run() {
		return speed* hours;
	}

	@Override
	public double stop() {
		return pause;
	}

	@Override
	public String toString() {
		return "Sedan [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

 
	

}
