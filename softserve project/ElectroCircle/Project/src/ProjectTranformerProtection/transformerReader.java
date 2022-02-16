package ProjectTranformerProtection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class transformerReader {
       public static void transformerReader (){
          try {
              Scanner sc = new Scanner(new File("src/ProjectTranformerProtection/Transformer110kV.txt"));
              String text = sc.useDelimiter("\\A").next();
              sc.close();
              String[] arr = text.split("\\s");
              String[][] information = new String[6][2];
              information[0][0] = "Transformer";
              information[1][0] = "High Voltage";
              information[2][0] = "Lower Voltage";
              information[3][0] = "Power";
              information[4][0] = "U.s.c.max";
              information[5][0] = "U.s.c.min";
              information[0][1] = arr[0];
              information[1][1] = arr[1];
              information[2][1] = arr[2];
              information[3][1] = arr[3];
              information[4][1] = arr[4];
              information[5][1] = arr[5];
              for (int i = 0 ; i < information.length;i++) {
                  System.out.println(Arrays.toString(information[i]));
              }
          }catch(FileNotFoundException e){
              System.err.println(e.getMessage());
          }
       }
}
