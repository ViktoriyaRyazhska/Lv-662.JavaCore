package Task2;

public class Circle implements Shape {
	
	double radius = 8;

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
