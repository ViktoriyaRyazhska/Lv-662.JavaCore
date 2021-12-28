package l3;

public class Employee {
	
	private static int totalSum = 0; 
	
	private String name;
	private int rate;
	private double hours;
	

	public Employee() {
		
	}
	
	public Employee(String name, int rate) {
		this.setName(name);
		this.setRate(rate);
	
	}
	
	public Employee(String name, int rate, double hours) {
		this.setName(name);
		this.setRate(rate);
		this.setHours(hours);
//		totalSum = totalSum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getSalary() {
		totalSum += rate * hours;
		return rate * hours;
	}
	
	public double getBonuses() {
		return ( rate * 110 ) / 100 * hours;		
	}	
	
	public static int getTotalSum() {
		return totalSum;

	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate +", hours=" + hours + "]";
	}

	public void changeRate(int rate) {
//		totalSum -= this.rate;
		this.rate = rate;
//		totalSum += rate;		
	}
		
		public static void main(String[] args) {
			Employee e1 = new Employee();
			e1.setName("Tom");
			e1.setRate(25);
			e1.setHours(40);
			
			Employee e2 = new Employee("Alex", 23, 38);
			e2.changeRate(27);
			
			Employee e3 = new Employee("Sem", 28);
			e3.setHours(45);
			
			System.out.println(e1.toString());
			System.out.println(e2);
			System.out.println(e3);
			
			System.out.println("Tom earned " + e1.getSalary());
			System.out.println("Alex earned " + e2.getSalary());
			System.out.println("Sem earned " + e3.getSalary());	
			
			System.out.println("Total salary sum is " + Employee.getTotalSum());
			
			System.out.println("Tom's rate including bonus is " + e1.getBonuses());		
		

	}
	
}
