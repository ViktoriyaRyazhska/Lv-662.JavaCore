package Program.PowerGridReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileInArray {

    /** This method read needed file and write data in array arrOfGrids*/

    public String [][] ReadFileInArray1(String[][] arrOfGrids , int rows){
        try {
            Scanner scanner = new Scanner(new FileReader("src/main/java/Program/PowerGridInfo/Grids35-150kV.txt"));
            arrOfGrids = new String[rows][4];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < 4; j++) {
                    arrOfGrids[i][j] = scanner.next();
                }
            }
        }catch(IOException e){
            e.getMessage();
        }
        return arrOfGrids;
    }

    // This method read needed file and write data in array arrOfGrids
    public String [][] ReadFileInArray2(String[][] arrOfGrids , int rows){
        try {
            Scanner scanner = new Scanner(new FileReader("src/main/java/Program/PowerGridInfo/Grids220-500kV.txt"));
            arrOfGrids = new String[rows][4];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < 4; j++) {
                    arrOfGrids[i][j] = scanner.next();
                }
            }
        }catch(IOException e){
            e.getMessage();
        }
        return arrOfGrids;
    }
}
