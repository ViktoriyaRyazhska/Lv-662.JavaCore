package hw7_p2;

public class MainWrapper {
    public static void main(String[] args) {

        Wrapper<Integer> wrapperInt = new Wrapper<>(8);
        Wrapper<String> wrapperString = new Wrapper<>("years");
        Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);

        System.out.println(wrapperInt.getValue());
        System.out.println(wrapperString.getValue());
        System.out.println(booleanWrapper.getValue());
    }
}
