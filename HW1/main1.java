package java2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("¬ведите а");
double a = Integer.parseInt(br.readLine());
System.out.println("¬ведите b");
double b = Integer.parseInt(br.readLine());
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("a*b="+(a*b));
System.out.println("a/b="+(a/b));

  }
}


