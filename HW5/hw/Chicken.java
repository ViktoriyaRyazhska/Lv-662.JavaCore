package hw;

public class Chicken extends FlyingBird {
	
	String feathers = "red";
	int layEggs = 1;
	@Override
	public String toString() {
		return "Chicken feathers is " + feathers + ", it lays " + layEggs + " eggs. ";
	}



}
