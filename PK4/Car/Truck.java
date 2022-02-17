package java18;

public class Truck extends Car{
	int mileage;
	int pause;
	@Override
	public double run() {
		return mileage;
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


