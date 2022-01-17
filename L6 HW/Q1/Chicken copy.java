package l6HWQ1;

public class Chicken extends NonFlyingBird {
	Chicken () {
		this.feathers = "White";
		this.layEggs = 1;
	}
	
	@Override
	public String getType() {
		return "Chicken";
	}
}
