package hw9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 слов");
        String sentence = br.readLine();

        String[] arr = sentence.split(" ");

        String longWord = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= longWord.length()) {
            	longWord = arr[i];
            }
        }
        System.out.println("Самое длинное слово: " + longWord);
        int longWordlength = longWord.length();
        System.out.println("Колличество букв: " + longWordlength);
        StringBuffer sb = new StringBuffer(arr[1]);
        System.out.println("" + sb.reverse());


    }
}
