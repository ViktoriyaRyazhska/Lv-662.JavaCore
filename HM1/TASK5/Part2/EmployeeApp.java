package Task_5HM.Part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Emploee em1 = new Emploee(br.readLine(), Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
        Developer dev1 = new Developer(br.readLine(),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),br.readLine());

        System.out.println( em1.report());
        System.out.println( dev1.report());
    }
}
