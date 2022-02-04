package pk8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pk2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Введите ФИО: ");
        String name = br.readLine();

        String[] arr = name.split(" ");
        String s = "Ваша фамилия и инициалы: " + arr[0] + " " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".";
        System.out.println(s);
        System.out.println("Вас зовут: " + arr[1]);
        System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
    }
}