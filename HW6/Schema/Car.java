package Schema;

public class Car extends GroundVehicles {

	private String model = "KIA";
	
	public Car() {
		
	}
	@Override
	public void drive() {
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

}
