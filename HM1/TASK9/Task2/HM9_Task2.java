package Task_9HM.Task2;

//Enter a sentence that contains the words between more than one space. Convert all spaces, consecutive, one. For
// example, if we introduce the sentence "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

import java.util.Arrays;

public class HM9_Task2 {
    public static void main(String[] args) {
        String enterSentence = "Summer    changes     spring   as   winter    changes    autumn";
        System.out.println(" Before : \"" + enterSentence + "\"");

        enterSentence = enterSentence.replaceAll("\\s+","`");
        enterSentence = enterSentence.replaceAll("`"," ");
        System.out.println(" After : \"" + enterSentence + "\"");
    }
}
