package hw;

public class Swallow extends FlyingBird {
	
	String feathers = "white";
	int layEggs = 3;

	@Override
	public String toString() {
		return "Swallow feathers is " + feathers + ", it lays" + layEggs + " eggs. ";
	}

}
