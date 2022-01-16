package hw4;

public class Car {
    private String type;
    private String engineCapacity;
    private int productionYear;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car(String type, String engineCapacity, int productionYear) {
        this.type = type;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car {" +
                "type='" + type + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
