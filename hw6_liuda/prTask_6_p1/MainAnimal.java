package prTask_6_p1;

public class MainAnimal {
    public static void main(String[] args) {
       // String animal1 = "Parrot";
        //String animal2 = "Turtle";

        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].voice());
            System.out.println(animals[i].feed());

        }

       // public String voice();
    }
}

