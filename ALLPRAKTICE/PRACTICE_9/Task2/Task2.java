package Task_9Praktice.Task2;


//Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
//1) surnames and initials
//2) name
//3) name, middle name and last name

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static Task_9Praktice.Task2.Task2Core.Name;
import static Task_9Praktice.Task2.Task2Core.SurnameAndInitials;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Name(arr));
        System.out.println(SurnameAndInitials(arr));

    }
}
