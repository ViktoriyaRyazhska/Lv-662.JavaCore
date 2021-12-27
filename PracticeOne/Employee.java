package TaskTwo;
public class Employee {


    private static int totalSum =0;
    private static int count = 0;

    private   String name;
    private   int rate;
    private   int hours;

    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += rate;
    }

    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
        totalSum +=rate;
    }

    public Employee() {
    }

    {
        count++;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  int getRate() {
        return rate;
    }

    public  void setRate(int rate) {
        totalSum-= this.rate;
        this.rate = rate;
        totalSum += rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", rate =" + rate + ", hours=" + hours +"]";
    }

    public  int getSalary(){
        return rate * hours;
    }

    public void changeRate(int rate){
        this.rate = rate;
    }

    public double getBonuses(){
        return (rate * hours) * 0.1;
    }
}
