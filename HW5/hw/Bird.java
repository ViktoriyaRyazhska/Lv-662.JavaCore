package hw;

public abstract class Bird {
	
	String feathers;
	int layEggs;
	
	public abstract boolean fly();
	
	public void print () {
		System.out.println("This is a bird.");
	}


}
