package com.company;

public class Main {

    public static void main(String[] args) {

        Wrapper<Integer> integerWrapper = new Wrapper<>(2);
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);

        System.out.println(integerWrapper.getValue());
        System.out.println(stringWrapper.getValue());
        System.out.println(booleanWrapper.getValue());

    }
}
