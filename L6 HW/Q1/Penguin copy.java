package l6HWQ1;

public class Penguin extends NonFlyingBird {
	Penguin() {
		this.feathers = "Black/White";
		this.layEggs = 1;
	}
	
	@Override
	public String getType() {
		return "Penguin";
	}

}
