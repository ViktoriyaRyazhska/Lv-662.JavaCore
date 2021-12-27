package Task_2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static double totalSum;
    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //constructors
    public Employee(){}
    public Employee(String name , int rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name , int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    //methods

    public int getSalary(){
        return rate * hours;
    }
    @Override
     public String toString(){
         return (" Employee name = " + name + " , rate = " + rate + " , work hours = " + hours);
    }
    public int changeRate(int rate,int hours) {
        this.rate = rate;
        return rate * hours;
    }
    public double getBonuses() {
        return (rate * hours * 0.1) ;
    }
}

