package Program.PowerGridReader;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class LineReader {
    public double lineReader() {
        System.out.println("\nEnter power grid class (35,110,150,220,330,500)");
        Scanner sc = new Scanner(System.in);
        int rowsWithNotNull = 0;
        int column = 0;
        int rows = 0;
        double resistant = 0;
        int []data ;
        CountFileRows c1 = new CountFileRows();
        ReadFileInArray r1 = new ReadFileInArray();
        ReadNeededLineNotNull re1 = new ReadNeededLineNotNull();
        try {
            int chooseGridClass = sc.nextInt();
            String[][] arrOfGrids = new String[0][0];
            String[][] arrOfGrids1 = new String[0][0];

            //read information about power grids and write info into array and print info to select power grid section
            if (chooseGridClass == 35 || chooseGridClass == 110 || chooseGridClass == 150) {

                //count file rows
                rows = c1.countFile1Rows();
                rowsWithNotNull = rows;
                arrOfGrids = r1.ReadFileInArray1(arrOfGrids,rows);
                arrOfGrids1 = new String[rows][2];

            } else if (chooseGridClass == 220 || chooseGridClass == 330 || chooseGridClass == 500) {

                //rows file rows
                rows = c1.countFile2Rows();
                rowsWithNotNull = rows;
                arrOfGrids = r1.ReadFileInArray2(arrOfGrids,rows);
                arrOfGrids1 = new String[rows][2];
            } else {
                System.out.println("Cant find power grid this class");
                System.exit(3);
            }

            data = re1.neededColumn(chooseGridClass, rowsWithNotNull, column, arrOfGrids, arrOfGrids1, rows);
            column = data[0];
            rowsWithNotNull = data[1];
            String[] section = new String[rowsWithNotNull];
            for (int i = 0 , j = 0; i < rowsWithNotNull  ; i++ , j++) {
                if (Double.parseDouble(arrOfGrids[j][column]) == 0) {
                    i = i - 1 ;
                }else {
                    section[i] = arrOfGrids[j][0];
                }
            }


            System.out.println("\nEnter power grid section " + Arrays.toString(section));
            Scanner sc1 = new Scanner(System.in);
            String sectionOfGrid = sc1.nextLine();
            for (int i = 0; i < rows; i++) {
            if (arrOfGrids1[i][0].contains(sectionOfGrid)) {
                resistant = Double.parseDouble(arrOfGrids1[i][1]);
                break;
                }
            }
            System.out.println("\nResistant of selected power grid is " + resistant + " Ohm ");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return resistant;
    }
}