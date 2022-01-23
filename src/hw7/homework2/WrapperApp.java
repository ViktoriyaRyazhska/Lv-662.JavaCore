package hw7.homework2;

public class WrapperApp {
    public static void main(String[] args) {
        Wrapper<Integer> wInteger = new Wrapper<>(4);
        Wrapper<String> wString = new Wrapper<>("Generic Test");
        Wrapper<Boolean> wBoolean = new Wrapper<>(true);

        System.out.println(wInteger.getValue());
        System.out.println(wString.getValue());
        System.out.println(wBoolean.getValue());
    }
}
