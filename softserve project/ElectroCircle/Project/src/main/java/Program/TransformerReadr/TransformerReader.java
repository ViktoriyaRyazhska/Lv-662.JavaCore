package Program.TransformerReadr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TransformerReader {
    public String[][] transformerReader() {
        System.out.println("\nEnter transformer class (35,110,220) to choose transformer ");
        String[][] information = new String[6][2];
        int transformerClass = 0;
        try {
            Scanner sc = new Scanner(System.in);
            transformerClass = sc.nextInt();
            switch (transformerClass) {
                case 35:
                    sc = new Scanner(new File("src/main/java/Program/TransformerInfo/Transformer35kV.txt"));
                    break;
                case 110:
                    sc = new Scanner(new File("src/main/java/Program/TransformerInfo/Transformer110kV.txt"));
                    break;
                case 220:
                    sc = new Scanner(new File("src/main/java/Program/TransformerInfo/Transformer220kV.txt"));
                    break;
                default:
                    System.out.println("Cant find transformer this class");
                    System.exit(3);
            }
            String text = sc.useDelimiter("\\A").next();
            sc.close();
            String[] arr = text.split("\\s");
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
            for (int i = 0; i < information.length; i++) {
                System.out.println(Arrays.toString(information[i]));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return information;
    }
}
