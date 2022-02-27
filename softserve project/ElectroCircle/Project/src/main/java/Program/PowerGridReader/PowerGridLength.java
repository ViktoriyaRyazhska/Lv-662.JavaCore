package Program.PowerGridReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**This method need to read length of power grid and return power grid length, after this value
 * will be needed in calculating.
 */


public class PowerGridLength {
    public double powerGridLength() {
        double powerGridLength = 0;
        try {
            //Read length from console.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter power grid length in km");
            powerGridLength = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e){
           //Here if user enter wrong format number he will see "Wrong entered format".
            System.err.println("Wrong entered format, need integer value!!!");
            System.exit(3);
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return powerGridLength;
    }
}
