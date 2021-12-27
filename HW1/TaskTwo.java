   import java.io.BufferedReader;
   import java.io.IOException;
   import java.io.InputStreamReader;
public class TaskTwo {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first and second number");
        Double a = Double.parseDouble(br.readLine());
        Double b = Double.parseDouble(br.readLine());

        System.out.println("sum of numbers " + (a+b));
        System.out.println("subtraction of numbers " + (a-b));
        System.out.println("multiplication of numbers " + (a*b));
        System.out.println("division of numbers " + (a/b));
    }
}
