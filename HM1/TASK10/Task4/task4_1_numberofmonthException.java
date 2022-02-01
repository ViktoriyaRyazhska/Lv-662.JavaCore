package Task_10HM.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ask user to enter the number of month. Read the value and write the amount of days in this month
// (create array with amount days of each month).

public class task4_1_numberofmonthException {
    public static void main(String[] args){
try {
    int[] Informations = new int[]{31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("pleas enter the number of month in range 1...12");
    int x = (Integer.parseInt(br.readLine())) - 1;
    if (x <= 12 && x >= 0) {
        System.out.println("in this mounth " + Informations[x] + " days");
    } else {
        System.out.println("wrong number of month");
    }
}catch (NumberFormatException e){
    System.err.println(" Wrong format , pleas try again ");
}catch (IndexOutOfBoundsException e){
    System.err.println(" IndexOutOfBoundsException " + e.getMessage());
}catch (Exception e){
    System.err.println(" Something wrong ");
}
    }
}
