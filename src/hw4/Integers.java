package hw4;

public class Integers {
    public static void main(String[] args) {

        int[] numbers = {-15, -10, -8, 56, 45, 565, -89, 51, -4, 100};
        int max = numbers[0];
        int imax = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > 0) {
            sum += numbers[j];
            }
        }
        System.out.println("Sum = " + sum);

        int negative_amount = 0;
        for (int a : numbers) {
            if (a < 0) {
                negative_amount++;
            }
        }
        System.out.println("Amount of negative numbers = " + negative_amount);

        int positive_amount = 0;
        for (int b : numbers) {
            if (b > 0) {
                positive_amount++;
            }
        }
        System.out.println("Amount of positive numbers = " + positive_amount);

        if (positive_amount != negative_amount) {
            String amount = (positive_amount > negative_amount) ? "\nMore positive values" : "\nMore negative values";
            System.out.println(amount);
        } else {
            System.out.println("\nPositive and negative numbers are equals");
        }
    }
}
