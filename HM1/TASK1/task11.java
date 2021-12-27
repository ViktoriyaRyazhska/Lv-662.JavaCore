package Task_1_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task11 {
public static void main(String[]args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How are you?");
        String text = br.readLine();
    System.out.println("You answer " + text);
    }
}