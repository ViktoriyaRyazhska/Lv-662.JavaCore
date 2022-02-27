package Program.PowerGridReader;

public class ReadNeededLineNotNull {

    /** This method take chosen column (which depends from chosen grid class) and counts all not zero rows,
     * then forms integer rowsWithNotNull. Also method form array arrOfGrids1 that contains only name column
     * and column chosen chooseGridClass. */

    public int [] neededColumn(int chooseGridClass, int rowsWithNotNull, int column, String[][] arrOfGrids, String[][] arrOfGrids1, int rows) {
        switch (chooseGridClass) {
            case 35, 220:
                column = 1;
                for (int i = 0; i <rowsWithNotNull;i++){
                    if (Double.parseDouble(arrOfGrids[i][column])==0){
                        rowsWithNotNull -=1;
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0, l = 0; l < 2; j += column, l++) {
                        arrOfGrids1[i][l] = arrOfGrids[i][j];
                    }
                }
                break;
            case 110, 330:
                column = 2;
                for (int i = 0; i <rowsWithNotNull;i++){
                    if (Double.parseDouble(arrOfGrids[i][column])==0){
                        rowsWithNotNull -=1;
                    }
                }
                for (int i = 0; i < rows; i++){
                    for (int j = 0, l = 0; l < 2; j += column, l++) {
                        arrOfGrids1[i][l] = arrOfGrids[i][j];
                    }
                }
                break;
            case 150, 500:
                column = 3;
                for (int i = 0; i <rowsWithNotNull;i++){
                    if (Double.parseDouble(arrOfGrids[i][column])==0){
                        rowsWithNotNull -=1;
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0, l = 0; l < 2; j += column, l++) {
                        arrOfGrids1[i][l] = arrOfGrids[i][j];
                    }
                }
                break;
        }
        int []data = new int[]{column,rowsWithNotNull};
        return data;
    }
}