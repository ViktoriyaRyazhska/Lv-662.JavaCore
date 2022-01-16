package hw4;

public class TenInteger {
    public static void main(String[] args) {
        int[] numbers = {45, 44, 31, 56, -13, -4, 1, 310, 300, 314};

        // check in first 5 elements are positive
        int positive = 0;
        for (int i = 0; i < numbers.length/2; i++) {
            if (numbers[i] > 0) {
                positive++;
            }
        }

        // Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case
        if (positive == 5) {
            int sum = 0;
            for (int i = 0; i < numbers.length/2; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum of first 5 elements = " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < numbers.length; i++) {
                product = product * numbers[i];
            }
            System.out.println("Product of last 5 elements = " + product);
        }

    }
}
