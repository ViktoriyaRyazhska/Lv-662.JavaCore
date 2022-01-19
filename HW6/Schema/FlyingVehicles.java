package Schema;

public abstract class FlyingVehicles extends Passengers implements Vehicle {
	
	public FlyingVehicles() {
		
	}
	
	public abstract void fly();
	
	public abstract void land();

}
