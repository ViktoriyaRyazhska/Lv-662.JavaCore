package java18;

public class Sedan extends Car{
int mileage = 150000;
int pause = 3;
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
	return "Sedan [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}
}
