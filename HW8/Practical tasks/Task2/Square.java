package Task2;

public class Square implements Shape {
	
	int side = 10;

	@Override
	public double getArea() {
		return side * side;
	}

}
