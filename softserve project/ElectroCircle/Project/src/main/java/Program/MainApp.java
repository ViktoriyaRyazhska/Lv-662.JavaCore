package Program;

import Program.Imagine.SchemeImagine;
import Program.Mathes.MathCalculation;
import Program.Mathes.SystemParameters;
import Program.PowerGridReader.LineReader;
import Program.PowerGridReader.PowerGridLength;
import Program.SystemVoltage.ReadVoltage;
import Program.TransformerReadr.TransformerReader;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Program calculation of short-circuit current for a two-winding transformer");

        Scanner scanner = new Scanner(System.in);

        System.out.println("To start please enter something in console");
        scanner.next();

        System.out.println("The program finds the short-circuit current  at points K1 and K2");
        System.out.println("In the future, these calculations will help to configure the protection devices");
        Thread s = new Thread(new SchemeImagine());
        s.start();

        TransformerReader t1 = new TransformerReader();
        String[][] transformerInfo = t1.transformerReader();
        LineReader l1 = new LineReader();
        ReadVoltage s1 = new ReadVoltage();
        PowerGridLength p1 = new PowerGridLength();


        SystemParameters syst = new SystemParameters();
        syst = new SystemParameters.SystemBuilder()
                .addPowerGridResist(l1.lineReader())
                .addPowerGridLength(p1.powerGridLength())
                .addSystemVoltage(s1.SystemVoltage())
                .addShortCircCurrentHight(Double.parseDouble(transformerInfo[4][1].replaceAll("%", "")))
                .addShortCircCurrentLow(Double.parseDouble(transformerInfo[5][1].replaceAll("%", "")))
                .addTransformerPower(Integer.parseInt(transformerInfo[3][1].replaceAll("[a-zA-Z]", "")))
                .addTransformerVoltageH(Double.parseDouble(transformerInfo[1][1].replaceAll("[a-zA-Z]", "")))
                .addTransformerVoltageL(Double.parseDouble(transformerInfo[2][1].replaceAll("[a-zA-Z]", "")))
                .build();
        System.out.println("\n" + syst);

        MathCalculation mathCalculation = new MathCalculation();
        mathCalculation.calculateResistance(syst);
        double k1max = mathCalculation.shortCircleCurrentK1MaxCalc(syst);
        double k1min = mathCalculation.shortCircleCurrentK1MinCalc(syst);
        double k2max = mathCalculation.shortCircleCurrentK2MaxCalc(syst);
        double k2min = mathCalculation.shortCircleCurrentK2MinCalc(syst);

        String[][] resultTableArray = new String[3][3];
        resultTableArray[0][0] = "point / regime";
        resultTableArray[1][0] = "K1";
        resultTableArray[2][0] = "K2";
        resultTableArray[0][1] = "min current";
        resultTableArray[0][2] = "max current";
        resultTableArray[1][1] = String.format("%.2f",k1min);
        resultTableArray[1][2] = String.format("%.2f",k1max);
        resultTableArray[2][1] = String.format("%.2f",k2min);
        resultTableArray[2][2] = String.format("%.2f",k2max);
        System.out.println("\n");

        for(String[] row : resultTableArray ){
            System.out.format("%15s %15s %15s %n",row);
        }
    }
}