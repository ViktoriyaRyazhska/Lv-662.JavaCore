package Program.SystemVoltage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadVoltage {
    public int SystemVoltage() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sysVoltage = 0;
        try {
            System.out.println("\nEnter system voltage");
            sysVoltage = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return sysVoltage;
    }
}
