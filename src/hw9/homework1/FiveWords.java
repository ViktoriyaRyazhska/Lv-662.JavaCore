package hw6.hw9.homework1;

public class FiveWords {
    public static void main(String[] args) {
        String fiveWords = "one two three four five";
        String longestWord = "";

        String[] words = fiveWords.split(" ");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.print("Longest word is: \"" + longestWord + "\" with " + longestWord.length() + " letters");

        StringBuilder sb = new StringBuilder(words[1]);
        sb.reverse();
        System.out.println("\nSecond word (\"" + words[1] + "\") in reverse order: \"" + sb + "\"");
    }
}
