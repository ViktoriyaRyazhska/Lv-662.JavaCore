package hw6p2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus(int passehgers, String route) {
        super(passehgers);
        this.route = route;
    }

    public String getRoute(){
        return route;
    }

    public void setRoute(String route){
        this.route = route;
    }

    @Override
    public void drive() {

    }
}