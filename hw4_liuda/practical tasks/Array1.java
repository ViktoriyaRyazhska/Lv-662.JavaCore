package prTask4p1;

public class Array1 {
    public static void main(String[] args) {
        int[] array10 = {7, -5, 3, -2, 4, 8, 6, 9, 10, 1};
        int max = array10[0];
        int imax = 0;
        int i = 0;

        while (i < array10.length) {
            if (array10[i] > max) {
                max = array10[i];
                imax = i;
            }
            i++;
        }
        System.out.print("The biggest number = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

       int sum = 0;
       for (i = 0; i < array10.length; i++) {
           if (array10[i] > 0) {
               sum += array10[i];
           }
       }

       System.out.println("Sum of positive numbers = " + sum);

        int amount = 0;
        for (int a : array10) {
            if (a < 0) {
                amount++;
            }
        }
        System.out.println("Amount of negative numbers = " + amount);


        if (amount < array10.length) {
            System.out.println("There are more positive values than negative");
        }
        else
            System.out.println("There are more negative values than positive");



    }
}
