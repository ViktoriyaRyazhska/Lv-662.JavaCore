package hw12;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Pk3 {
    public static void main(String[] args) {
        String fileName = "src/hw12/tx.txt";
        BufferedReader br = null;
        String s = null;
        int count = 0;
        int a = 0;
        int b = 0;
        ArrayList<String> List = new ArrayList<>();
        ArrayList<Integer> NumberChars = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                List.add(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < List.size(); i++) {
            NumberChars.add(List.get(i).replace(" ", "").length());
            count++;
            System.out.println("Количество символов в " + count + " линии : " + NumberChars.get(i));
        }
        int largestString = NumberChars.get(0);
        int shortestString = NumberChars.get(0);
        for (int i = 0; i < NumberChars.size(); i++) {
            if (NumberChars.get(i) >= largestString) {
                largestString = NumberChars.get(i);
                a = i + 1;
            }else if(NumberChars.get(i) < shortestString || NumberChars.get(i) != 0) {
                shortestString = NumberChars.get(i);
                b = i + 1;
        }
        }
        System.out.println("Самая длинная линия - " + a + ", количество символов в ней :  "  + largestString);
        System.out.println("Самая короткая линия - " + b + ", количество символов в ней :  "  + shortestString);       
        List<String> z = new ArrayList<String>();
        System.out.println("Строки которые включают в себя var: ");
        for (String str : List) {
            if (str.contains("var")) {
                z.add(str);  
            }
        }System.out.println(z);

    }

}
