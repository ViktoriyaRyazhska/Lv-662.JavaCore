package Task_4_AdditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        String[] rome = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV"};
        y = (y % 100 == 0)? y - 1 : y;
        int c = (y  - (y % 100)) / 100 ;
        System.out.println(rome[(c)]);

    }
}
