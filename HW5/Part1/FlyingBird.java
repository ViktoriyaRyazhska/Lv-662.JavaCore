package com.company;

public class FlyingBird extends Bird {

    protected FlyingBird(boolean feathers, boolean layEggs){
        super(feathers, layEggs);
    }

    @Override
    protected void fly() {
        System.out.println("I can fly");
    }
}
