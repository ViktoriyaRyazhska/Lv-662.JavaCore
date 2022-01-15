package lesson_4_CW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Anna", 700, 1);
        emp[1] = new Employee("Mariia", 500, 2);
        emp[2] = new Employee("Rosa", 600, 2);
        emp[3] = new Employee("Diaz", 600, 3);
        emp[4] = new Employee("Silvi", 700, 5);

        //System.out.println(emp[0].toString());  display 1st element of array

        System.out.println("Please enter the Department number");
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartment_number() == a) {
                System.out.println("In department we have next employee: " + emp[i].getName());
            }
        }
        System.out.println();

        Employee tmp;
        for (int i = 0; i < emp.length; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].getSalary() < emp[j].getSalary()) {
                    tmp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = tmp;
                }
            }
        }
        System.out.println("Arranging workers by the field salary in descending order: \n");

            for (int i = 0; i < emp.length; i++) {
                System.out.println(emp[i]);
            }





    }

//        int[] arr = {70, 6, 8, -7, -7, -9};
//        System.out.println(Arrays.toString(arr));
//        max(arr);
//        sumPositive(arr);
//        System.out.println("Amount of negative elements is " + amount_Negative(arr));
//        System.out.println("Amount of positive elements is " + amount_Positive(arr));
//
//        if (amount_Positive(arr) != amount_Negative(arr)) {
//            String more = (amount_Negative(arr) > amount_Positive(arr)) ? "More negative elements" : "More positive elements";
//            System.out.println(more);
//        } else {
//            System.out.println("The same amount of negative anf positive values");
//        }
//    }
//
//    public static void max(int arr[]) {
//        int max = arr[0];
//        int imax = 0;
//        int i = 0;
//        while (i < arr.length) {
//            if (arr[i] > max) {
//                max = arr[i];
//                imax = i;
//            }
//            i++;
//        }
//        System.out.println("Maximum = " + max);
//    }
//
//    public static void sumPositive(int arr[]) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                sum += arr[i];
//            }
//        }
//        System.out.println("Sum = " + sum);
//    }
//
//    public static int amount_Negative(int[] arr) {
//        int amount_N = 0;
//        for (int a : arr) {
//            if (a < 0) {
//                amount_N++;
//            }
//        }
//        return amount_N;
//    }
//
//    public static int amount_Positive(int[] arr) {
//        int amount_P = 0;
//        for (int a : arr) {
//            if (a > 0) {
//                amount_P++;
//            }
//        }
//        return amount_P;
//    }
}

