package HW8;

public class WrapperApp {
    public static void main(String[] args) {
    Wrapper<Integer> integerWrapper = new Wrapper<>(127);
    Wrapper<String> stringWrapper = new Wrapper<>("string");
    Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);

    integerWrapper.getValue();
    stringWrapper.getValue();
    booleanWrapper.getValue();

    }
}
