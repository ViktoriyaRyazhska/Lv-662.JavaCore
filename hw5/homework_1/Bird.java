package hw5.homework_1;

public abstract class Bird {
	
	protected boolean feathers;
	protected boolean layEggs;
	
	public abstract void fly();

	public boolean hasFeathers() {
		return feathers;
	}

	public boolean doesLayEggs() {
		return layEggs;
	}

}
