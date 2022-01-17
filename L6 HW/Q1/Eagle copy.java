package l6HWQ1;

public class Eagle extends FlyingBird {
	Eagle () {
		this.feathers = "White/Black";
		this.layEggs = 1;
	}
	
	@Override
	public String getType() {
		return "Eagle";
	}

}
