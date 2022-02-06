package HW4;


public class HW4_3 { public static void main(String[] args) {
        int[] num = {2, -5, 7, -4, 8};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of second positive number is " + i);
                break;
            }
        }
        int min = num[0];
        int imin = 0;
        int i = 0;
        while (i < num.length) {
            if (num[i] > min) {
                min = num[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Position in array =" + imin);
        System.out.println(" This number in " + (imin + 1) + " place");
        }
}

