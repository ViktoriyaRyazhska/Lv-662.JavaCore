package Task_4Praktice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EmploeeApp {
    public static void main(String[] args) throws IOException {

       //all employees of a certain department (enter department number in the console)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] departamentNumber = new int[5];
        System.out.println("Enter departament number person1");
        departamentNumber[0]= Integer.parseInt(br.readLine());
        System.out.println("Enter departament number person2");
        departamentNumber[1]= Integer.parseInt(br.readLine());
        System.out.println("Enter departament number person3");
        departamentNumber[2]= Integer.parseInt(br.readLine());
        System.out.println("Enter departament number person4");
        departamentNumber[3]= Integer.parseInt(br.readLine());
        System.out.println("Enter departament number person5");
        departamentNumber[4]= Integer.parseInt(br.readLine());


        Emploee person1 = new Emploee("Tom",departamentNumber[0],15000);
        Emploee person2 = new Emploee("Sara",departamentNumber[1],20000);
        Emploee person3 = new Emploee("Tony",departamentNumber[2],10000);
        Emploee person4 = new Emploee("Kate",departamentNumber[3],12000);
        Emploee person5 = new Emploee("Pit",departamentNumber[4],17000);

        //arrange workers by the field salary in descending order

        int[] salaryList = new int[5];
        salaryList[0] = person1.getSalary();
        salaryList[1] = person2.getSalary();
        salaryList[2] = person3.getSalary();
        salaryList[3] = person3.getSalary();
        salaryList[4] = person4.getSalary();

        //sorting array

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
