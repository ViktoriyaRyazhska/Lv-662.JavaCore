package HW12;

import java.time.LocalDate;


public class ValidDate {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        String time = currentDate.toString();
        System.out.println(time);
        String[] timeArr = time.split("-");
        System.out.println(timeArr[1] + "-" + timeArr[2] + "-" + timeArr[0]);

    }
}