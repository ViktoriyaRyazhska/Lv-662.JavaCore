package HW9;

import java.util.Arrays;
import java.util.Comparator;

public class StringMethod {
    public static void longestWord(String sentence){
        String []wordToArr = sentence.split(" ");
        int number = 0;
        String longestWord = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length)).orElse(null).toString();
        System.out.println(longestWord + " , length - " + longestWord.length());

        for (int i = 0 ; i < wordToArr.length;i++){
            number = (wordToArr[i].equalsIgnoreCase(longestWord))?i:0;
        }
        System.out.println(number+1);
    }

    public static void reverseSecondWord(String sentence){
        String []wordToArr = sentence.split(" ");
        String input = wordToArr[1];
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
    public static void deleteSpace(){
        String inputSentence = "Smth   to test    how   our method work";
        System.out.println(" Before : \"" + inputSentence + "\"");

        inputSentence = inputSentence.replaceAll("\\s+","`");
        inputSentence = inputSentence.replaceAll("`"," ");
        System.out.println(" After : \"" + inputSentence + "\"");
    }
}
