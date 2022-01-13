package Task_4_AdditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XII {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of judge");
        int numberOfJudge = Integer.parseInt(br.readLine());
        int[] judgeRating = new int[numberOfJudge];
        for (int i = 0; i < judgeRating.length ; i++){
            System.out.println("enter rating " + (i+1) + " judge");
            judgeRating[i] = Integer.parseInt(br.readLine());
        }
        int maxValue = 0;
        int minValue = 2000000000;
        double x = 0;
        for (int i = 0 ; i < judgeRating.length ; i++ ) {
            maxValue = (judgeRating[i] > maxValue) ? judgeRating[i] : maxValue;
            minValue = (judgeRating[i] < minValue) ? judgeRating[i] : minValue;
            x = x +  judgeRating[i];
        }
        int k = 0;
        int m = 0;
        for(int i = 0 ; i < judgeRating.length;i++ ){
            if(judgeRating[i] == maxValue){
                k++;
            }else if (judgeRating[i] == minValue) {
                m++;
            }
        }
        if (k>judgeRating.length/2){
            System.out.println("The sportsmen rating is " + maxValue);
        }else if(m>judgeRating.length/2){
            System.out.println("The sportsmen rating is " + minValue);
        }else {
            System.out.println("The sportsmen rating is " + (x - minValue - maxValue) / (judgeRating.length - 2));
        }
    }
}

