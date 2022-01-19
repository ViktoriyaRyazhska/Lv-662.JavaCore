package Payment;

public class PaymentMain {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[4];
		employees[0] = new SalariedEmployee("DS4415", "Tim", 2300);
		employees[1] = new ContractEmployee("KC2532", "Tom", 2400);
		employees[2] = new SalariedEmployee("GS4588", "Tik", 2780);
		employees[3] = new ContractEmployee("NL9015", "Tak", 2400);
		
		
		Employee sorting;
		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < employees.length; j++) {
				if (employees[i].calculatePay() > employees[j].calculatePay()) {
					sorting = employees[i];
					employees[i] = employees[j];
					employees[j] = sorting;
				}
			}
		}
		System.out.println("Salaries in descending order are: ");
		for (int i = 0; i < employees.length; i++) {
		System.out.println(employees[i].calculatePay() + " belongs to " + employees[i].name + ". ID number " + employees[i].employeeId);
		}
	}

}
