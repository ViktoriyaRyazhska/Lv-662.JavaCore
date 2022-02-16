import java.util.Scanner;

public class Task3 {
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть суму");
        int sum = Integer.parseInt(sc.nextLine());
        System.out.println("введіть курс");
        int curse = Integer.parseInt(sc.nextLine());
        double result = sum/curse;
        System.out.println(result);

    }

}
