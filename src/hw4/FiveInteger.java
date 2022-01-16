package hw4;

public class FiveInteger {
    public static void main(String[] args) {
        int[] numbers = {48, 58, 37, -56, 14};

        // position of second positive number; minimum and its position in the array.
        int i = 0;
        int second = numbers[0];
        int isecond = 0;
        int k = 1;
        int min = numbers[0];
        int imin = 0;
        while (i < numbers.length) {
            if (numbers[i] > 0 && k <= 2) {
                second = numbers[i];
                isecond = i;
                k++;
            };
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            };
            i++;
        }
        System.out.print("Second positive number = " + second);
        System.out.println(" is in " + (isecond + 1) + " place");

        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");

        // Organize entering integers until the first negative number. Count the product of all entered even numbers.
        int position = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < 0) {
                position = j;
            }
        }
        int product = 1;
        for (int j = 0; j < position ; j++) {
            if (numbers[j] % 2 == 0) {
                product = product * numbers[j];
            }
        }
        System.out.println("Product until the first negative number = " + product);

    }
}
