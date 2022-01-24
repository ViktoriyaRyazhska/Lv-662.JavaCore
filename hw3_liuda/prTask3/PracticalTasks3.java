package prTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PracticalTasks3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        oddNumbers(br);
        weekDays(br);
    }


    public static void oddNumbers(BufferedReader br) throws IOException {

        System.out.println("Enter first number");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Enter third number");
        int c = Integer.parseInt(br.readLine());
        int n = 0;


        if (a % 2 != 0) {
            n++;
        }
        if (b % 2 != 0) {
            n++;
        }
        if (c % 2 != 0) {
            n++;
        }
        System.out.println(n);

    }

    public static void weekDays(BufferedReader br) throws IOException {
        System.out.println("Enter the number of the day of the week: 1,2,3,4,5,6,7");
        String input = br.readLine();

        switch (input.toLowerCase()) {
            case "1":
                System.out.println("Monday");
                System.out.println("Понеділок");
                break;

            case "2":
                System.out.println("Tuesday");
                System.out.println("Вівторок");
                break;

            case "3":
                System.out.println("Wednesday");
                System.out.println("Середа");
                break;

            case "4":
                System.out.println("Thursday");
                System.out.println("Четвер");
                break;

            case "5":
                System.out.println("Friday");
                System.out.println("Пятниця");
                break;

            case "6":
                System.out.println("Saturday");
                System.out.println("Субота");
                break;

            case "7":
                System.out.println("Sunday");
                System.out.println("Неділя");
                break;

            default:
                System.out.println("Wrong");
                break;


        }


    }
}




