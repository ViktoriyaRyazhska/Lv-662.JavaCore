package lesson_8.HomeWork2;

public class Wrapper <T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {


        Wrapper<Integer> objectInt = new Wrapper<>();
        objectInt.setValue(4);
        Wrapper<String> objectString = new Wrapper<>();
        objectString.setValue("Green");
        Wrapper<Boolean> objectBoolean = new Wrapper<>();
        objectBoolean.setValue(true);

        System.out.println("objectInt = " + objectInt.getValue() +
                "; objectString = " + objectString.getValue() + "; objectBoolean = " + objectBoolean.getValue());

    }
}


