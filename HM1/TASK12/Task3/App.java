package Task_12HM.Task3;

//3. Create method to validate date according to format "mm.dd.yy"

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        String time = currentDate.toString();
        System.out.println(time);
        String [] arr = time.split("-");
        System.out.println(arr[1] + "-" + arr[2] + "-" + arr[0]);
    }
}
