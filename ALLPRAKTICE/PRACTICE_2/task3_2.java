package Task_3Practice;

import java.util.Scanner;

public class task3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Понеділок , Monday , Montag ");
                break;
            case 2:
                System.out.println("Вівторок , Tuesday , Dienstag ");
                break;
            case 3:
                System.out.println("Середа , Wednesday , Mittwoch ");
                break;
            case 4:
                System.out.println("Четвер , Thursday , Donnerstag ");
                break;
            case 5:
                System.out.println("Пятниця , Friday , Freitag ");
                break;
            case 6:
                System.out.println("Субота , Saturday , Samstag ");
                break;
            case 7:
                System.out.println("Неділя , Sunday , Sonntag ");
                break;
            default:
                System.out.println("Wrong number of day ");
        }
    }
}