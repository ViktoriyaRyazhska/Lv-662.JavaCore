package java8.Homework;

public class Encrypt_Decrypt {

    static String encrypt (String abc, int shift) {
        String s = "";
        int lenth = abc.length();
        for (int i = 0; i < lenth; i++){
            char c = (char)(abc.charAt(i) + shift);
            s += c;
        }
        return s;
    }

    static String decrypt (String abc, int shift) {
        String s = "";
        int lenth = abc.length();
        for (int i = 0; i < lenth; i++){
            char c = (char)(abc.charAt(i) - shift);
            s += c;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("abc", 3));
        System.out.println(decrypt("def", 3));
    }
}
