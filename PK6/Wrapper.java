package pk2;

public class Wrapper <T extends Shape> {
	T shape;
	
	public Wrapper(T shape) {
		this.shape = shape;
	}
	
	public double getArea() {
		return shape.getArea();
	}
	
}
