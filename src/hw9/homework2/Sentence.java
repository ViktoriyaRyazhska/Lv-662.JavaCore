package hw9.homework2;

public class Sentence {
    public static void main(String[] args) {
        String sentence = "I  am  learning    Java  Core";

        // one way
        System.out.println(sentence.replaceAll("\s+", " "));

        // another way
        String[] sentenceArr = sentence.split("\s+");

        StringBuilder sb = new StringBuilder(sentenceArr[0]);
        for (int i = 1; i < sentenceArr.length; i++) {
            sb.append(" ").append(sentenceArr[i]);
        }
        System.out.println(sb);
    }
}
