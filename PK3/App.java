package java13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер департамента сотрудника(1-3)");
    int dep = Integer.parseInt(br.readLine());
        int[] departamentNumber = {1,2,1,3,1};
        Employee [] emp =new Employee [5];
        emp[0] = new Employee("Олег",departamentNumber[0],15000);
        emp[1] = new Employee("Илья",departamentNumber[1],20000);
        emp[2] = new Employee("Влад",departamentNumber[2],10000);
        emp[3] = new Employee("Дмитрий",departamentNumber[3],12000);
        emp[4] = new Employee("Ольга",departamentNumber[4],17000);

       
        if(dep==1) {System.out.println("Имя:"+emp[0].getName()+" Номер департамента: "+emp[0].getDepartamentNumber()+" Зарплата: "+emp[0].getSalary());
        System.out.println("Имя:"+emp[2].getName()+" Номер департамента: "+emp[2].getDepartamentNumber()+" Зарплата: "+emp[2].getSalary());
        System.out.println("Имя:"+emp[4].getName()+" 1Номер департамента: "+emp[4].getDepartamentNumber()+" Зарплата: "+emp[4].getSalary());}	
        else if(departamentNumber[dep]==2) {System.out.println("Имя:"+emp[1].getName()+" Номер департамента: "+emp[1].getDepartamentNumber()+" Зарплата: "+emp[1].getSalary());}	
        else if(departamentNumber[dep]==3) {System.out.println("Имя:"+emp[3].getName()+" Номер департамента: "+emp[3].getDepartamentNumber()+" Зарплата: "+emp[3].getSalary());}	
        else {System.out.println("Вы ввели неправильный номер!");}
        int[] salaryList = new int[5];
        salaryList[0] = emp[0].getSalary();
        salaryList[1] = emp[1].getSalary();
        salaryList[2] = emp[2].getSalary();
        salaryList[3] = emp[3].getSalary();
        salaryList[4] = emp[4].getSalary();
        
        int x = 0;
        for(int i =0 ; i < salaryList.length - 1;i++){
            for(int j = i +1;j < salaryList.length; j++){
            if(salaryList[i] < salaryList[i+1]) {
                x = salaryList[i];
                salaryList[i] = salaryList[j];
                salaryList[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(salaryList));
    }
}