package hw;

public class Eagle extends FlyingBird {
	
	String feathers = "Brown";
	int layEggs = 5;
	
	@Override
	public String toString() {
		return "Eagle feathers is " + feathers + ", it lays " + layEggs + " eggs. ";
	}
	
}
