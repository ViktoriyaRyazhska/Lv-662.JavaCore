package HW4;

public class Car {
  private  String type;
  private  int yearOfProd;
  private  double engineCapacity;

  public Car(String type, int yearOfProd, double engineCapacity) {
    this.type = type;
    this.yearOfProd = yearOfProd;
    this.engineCapacity = engineCapacity;
  }

  public Car(){

  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getYearOfProd() {
    return yearOfProd;
  }

  public void setYearOfProd(int yearOfProd) {
    this.yearOfProd = yearOfProd;
  }

  public double getEngineCapacity() {
    return engineCapacity;
  }

  public void setEngineCapacity(double engineCapacity) {
    this.engineCapacity = engineCapacity;
  }

  @Override
  public String toString() {
    return "type: '" + this.type + "', Year of prod: '" + this.yearOfProd + "', engine capacity: '" + this.engineCapacity + "'";
  }
}
