package Task_6HM.Part1;

public class SalariedEmployee extends Employee implements Payment{

    //fields
    private int salary;
    private int salaryPerHour = 90;
    private int hourlyRate = 100;
    private int numbersOfHoursWorker = 8;
    private String name;

    private String socialSecurityNumber = "Social security = 20% from year payment";

    public SalariedEmployee(String employeeld ,String name) {
        super(employeeld,name);
        this.name = name;
    }

    //method
    @Override
    public int calculatePay() {
        return  hourlyRate * numbersOfHoursWorker ;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumbersOfHoursWorker() {
        return numbersOfHoursWorker;
    }

    public void setNumbersOfHoursWorker(int numbersOfHoursWorker) {
        this.numbersOfHoursWorker = numbersOfHoursWorker;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
