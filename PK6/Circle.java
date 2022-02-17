package pk2;

public class Circle implements Shape {
	double radius = 10;

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
