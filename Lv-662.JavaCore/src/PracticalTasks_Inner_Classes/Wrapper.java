package PracticalTasks_Inner_Classes;


//Create Wrapper class which should wrap any objects which implements Shape interface


public class Wrapper <T extends Shape> {
	T shape;
	
	public Wrapper(T shape) {
		this.shape = shape;
	}
	
//	public double getColor() {
//		return shape.getColor();
//	}
//
}
