package Schema;

public class Motorcycle extends GroundVehicles {

	private int maxSpeed = 250;
	
	public Motorcycle() {
		
	}
	
	@Override
	public void drive() {
		
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Motorcycle [maxSpeed=" + maxSpeed + "]";
	}

}
