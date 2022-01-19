package Schema;

public class Plane  extends FlyingVehicles {

	private int maxDistance = 5000;
	
	public Plane() {
		
	}
	
	@Override
	public void fly() {
		
	}

	@Override
	public void land() {
		
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	public String toString() {
		return "Plane [maxDistance=" + maxDistance + "]";
	}
	

}
