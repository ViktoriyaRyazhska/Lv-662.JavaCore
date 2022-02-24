package hw9_t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceSentence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence with two spaces: I  am  learning  Java  Core");
        String sentence = br.readLine().toLowerCase();
        System.out.println(sentence.replaceAll("\\s+", " "));

    }
}
