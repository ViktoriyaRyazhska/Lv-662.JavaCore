package Task_9HM.Task3;

//Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after the dot.
// Enter the text from the console that contains several occurrences of US currency. Display all occurrences on the screen.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class HM9_Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currency = br.readLine();
        String priceOfMilk = "Price of milk $3.32";
        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(currency);

    while(m.find()) {
        System.out.println(currency.substring(m.start(), m.end()));
    }

        Matcher n = p.matcher(priceOfMilk);
        while(n.find()) {
            System.out.println(priceOfMilk.substring(n.start(), n.end()));
        }
    }
}
