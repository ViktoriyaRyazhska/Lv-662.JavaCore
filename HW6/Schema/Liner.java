package Schema;

public class Liner extends WaterVehicle {
	private int floors = 3;
	
	public Liner () {
		
	}

	@Override
	public void isSailing() {
		
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return "Liner [floors=" + floors + "]";
	}
	
	
}
