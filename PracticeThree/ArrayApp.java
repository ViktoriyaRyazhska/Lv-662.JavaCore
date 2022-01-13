package PracticeThree;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = {-5, 7,4,2,-3,8,10,9,11,14};
        int maxValue = arr[0];
        int sum = 0;
        int negCount = 0;
        int posCount = 0;
        for(int x=0; x < arr.length; x++){
            if(arr[x] >maxValue){
                maxValue = arr[x];
            }
        }
        System.out.println("max value is : " + maxValue);

        for (int s : arr){
            if(s >= 0) {sum += s; posCount++; }
            if(s < 0) negCount++;
        }
        System.out.println("sum of numbers is : " + sum);
        System.out.println("count of negative numbers is : " + negCount);

        if(posCount > negCount) System.out.println("There are more positive numbers");
        else System.out.println("There are more negative numbers");
    }
}
