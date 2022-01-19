package Schema;

public class Bus extends GroundVehicles {

	private String route = "Defined";
	
	public Bus() {
		
	}
	
	@Override
	public void drive() {
		
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Bus [route=" + route + "]";
	}
	

}
