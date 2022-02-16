import java.util.Scanner;

public class Task2 {
    public static void  task2 (){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int count = 0;

        if (num % 2 ==0) {
           while (num % 2 == 0) {
               num = num /2;
               count++;
           }
       }
        System.out.println(2 + " ^ " + count);
        count = 0;
        if (num % 3 == 0) {
            while (num % 3 == 0) {
                num = num /3;
                count++;
            }
        }
        System.out.println(3 + " ^ " + count);
        count = 0;
        if ( num % 5 == 0) {
            while (num % 5 == 0) {
                num = num / 5;
                count++;
            }
        }
        System.out.println(5 + " ^ " + count);
    }
}
