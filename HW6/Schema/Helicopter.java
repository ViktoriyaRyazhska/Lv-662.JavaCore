package Schema;

public class Helicopter extends FlyingVehicles {

	public int weight = 275;
	public int maxHeight = 25000;
	
	public Helicopter() {
		
	}
	
	@Override
	public void fly() {
		
	}

	@Override
	public void land() {
		
	}

	@Override
	public String toString() {
		return "Helicopter [weight=" + weight + ", maxHeight=" + maxHeight + "]";
	}

}
