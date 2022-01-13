package PracticeThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name, Department number, and salary of five persons");

        Employee e = new Employee();

        Employee e1 = new Employee();
        e1.input(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));


        Employee e2 = new Employee();
        e2.input(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

        Employee e3 = new Employee();
        e3.input(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

        Employee e4 = new Employee();
        e4.input(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

        Employee e5 = new Employee();
        e5.input(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

        Employee[] arr = new Employee[5];

        arr[0] = e1;
        arr[1] = e2;
        arr[2] = e3;
        arr[3] = e4;
        arr[4] = e5;

        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x].getSalary() < arr[y].getSalary()) {
                    e = arr[x];
                    arr[x] = arr[y];
                    arr[y] = e;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}