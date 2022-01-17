package l6HWQ1;

public class Swallow extends FlyingBird {
	Swallow() {
		this.feathers  = "Blue";
		this.layEggs = 3;
	}
	
	@Override
	public String getType() {
		return "Swallow";
	}
}
