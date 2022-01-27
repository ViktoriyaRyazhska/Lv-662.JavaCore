package Task_7HM.Task2;

public class Application {
  public static void main(String[] args) {
    Wrapper<Integer> integerWrapper = new Wrapper<>(1234);
    System.out.println(integerWrapper.getValue());
    Wrapper<String> stringWrapper = new Wrapper<>("Hello");
    System.out.println(stringWrapper.getValue());
    Wrapper<Boolean> booleanWrapper = new Wrapper<>(false);
    System.out.println(booleanWrapper.getValue());


  }
}
