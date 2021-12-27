package Lesson_1.Task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	  public static void main(String[] args) throws IOException {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How are you?");
		String name = br.readLine();
		
		System.out.println("You are " + name);

}
}