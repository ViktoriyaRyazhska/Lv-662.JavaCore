package Task_10HM.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4_3_FiveIntegerNumberException {

/*Enter 5 integer numbers. Find :
1) position of second positive number;
2) minimum and its position in the array.
Organize entering integers until the first negative number. Count the product of all entered even numbers.*/

    public static void main(String[] args) throws IOException {
      try {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int[] fiveInt = new int[5];
          boolean permisionToEnter = true;
          for (int i = 0; i < fiveInt.length && permisionToEnter == true; i++) {
              fiveInt[i] = Integer.parseInt(br.readLine());
              permisionToEnter = (fiveInt[i] < 0) ? false : true;
          }
          boolean permision = false;
          boolean secpermision = true;
          int secPos = 0;
          for (int i = 0; i < fiveInt.length && secpermision == true; i++) {
              if (fiveInt[i] >= 0 && permision == false) {
                  permision = true;
              } else if (fiveInt[i] >= 0 && permision == true) {
                  secPos = i;
                  secpermision = false;
              }
          }
          System.out.println("1) Position of second positive number is " + secPos);

          int min = fiveInt[0];
          int minPos = 0;
          for (int i = 0; i < fiveInt.length; i++) {
              if (min > fiveInt[i]) {
                  min = fiveInt[i];
                  minPos = i;
              }
          }
          System.out.println("2) minimum is " + min + " its position in the array " + minPos);
          int even = 1;
          for (int i = 0; i < fiveInt.length; i++) {
              if (fiveInt[i] % 2 == 0) {
                  even *= fiveInt[i];
              } else {
                  continue;
              }
          }
          if (even != 1) {
              System.out.println("Count the product of all entered even numbers is " + even);
          } else {
              System.out.println("there no even numbers");
          }
      }catch (NumberFormatException e){
          System.err.println(" Wrong enter format ");
      }catch (IOException e){
          System.err.println(e.getMessage());
      }
    }
}
