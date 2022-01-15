package hw;

public class Penguin extends NonFlyingBird {
	
	String feathers = "small black";
	int layEggs = 2;
	
	@Override
	public String toString() {
		return "Penguin feathers is " + feathers + ", it lays " + layEggs + " eggs. ";
	}

}
