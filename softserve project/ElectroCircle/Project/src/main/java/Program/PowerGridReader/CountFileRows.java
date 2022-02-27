package Program.PowerGridReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountFileRows {

    public int countFile1Rows() {
        int rows = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/Program/PowerGridInfo/Grids35-150kV.txt"));
            while (br.readLine() != null) {
                rows++;
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return rows;
    }

    public int countFile2Rows() {
        int rows = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/Program/PowerGridInfo/Grids220-500kV.txt"));
            while (br.readLine() != null) {
                rows++;
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return rows;
    }
}
