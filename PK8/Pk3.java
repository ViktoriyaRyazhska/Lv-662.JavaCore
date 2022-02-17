package pk8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pk3 {

    public static boolean RegularExpression(String name) {
        String pattern = ("[а-яА-Я_a-zA-Z_0-9]{3,15}");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        return m.matches();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя:");
        String n1 = br.readLine();
        System.out.println("Введите имя:");
        String n2 = br.readLine();
        System.out.println("Введите имя:");
        String n3 = br.readLine();
        System.out.println("Введите имя:");
        String n4 = br.readLine();
        System.out.println("Введите имя:");
        String n5 = br.readLine();

        List<String> Names = new ArrayList<>();
        Names.add(n1);
        Names.add(n2);
        Names.add(n3);
        Names.add(n4);
        Names.add(n5);

        for (int i = 0; i < Names.size(); i++) {
            System.out.println(RegularExpression(Names.get(i)));
        }

    }
}