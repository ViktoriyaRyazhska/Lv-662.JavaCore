package com.company;

public class Main {

    public static void main(String[] args) {

        Bird[] birds ={
                new Eagle(true, true),
                new Swallow(true, true),
                new Chicken(true, false),
                new Penguin(false,true)
        };

        for(int i = 0; i < birds.length; i++){
            System.out.println(birds[i].toString());
            birds[i].fly();
        }
    }
}
/*
1. Develop abstract class Bird with attributes
feathers and layEggs and an abstract method
fly().
Develop classes FlyingBird and NonFlyingBird.
Create class Eagle, Swallow, Penguin and
Chicken.
Create array Bird and add different birds to
it.
Call fly() method for all of it. Output the
information about each type of created bird.
 */