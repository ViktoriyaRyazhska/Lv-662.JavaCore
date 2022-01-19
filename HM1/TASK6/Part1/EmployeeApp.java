package Task_6HM.Part1;

public class EmployeeApp  {
    public static void main(String[] args) {

            Employee[] arr = new Employee[4];
            arr[0] = new SalariedEmployee("4352", "Taras");
            arr[1] = new ContractEmployee("3251", "Tom");
            arr[2] = new SalariedEmployee("1214", "Kate");
            arr[3] = new ContractEmployee("5412", "Jana");

            Employee temp;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].calculatePay()) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
    }
}
