package hw2.hw5;

class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4%.2f",
                getName(), getAge(), position, getSalary());
    }
}