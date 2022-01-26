package com.company;

public class Dog {
    private String name;
    private int age;
    Breed breedOfDog;

    public Dog(String name, int age, Breed breed){
        this.name = name;
        this.age = age;
        breedOfDog = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(Breed breedOfDog) {
        this.breedOfDog = breedOfDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breedOfDog=" + breedOfDog +
                '}';
    }
}
