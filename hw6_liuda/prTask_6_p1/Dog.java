package prTask_6_p1;

public class Dog implements Animal{
    @Override
    public String voice(){
        return "Dog voice - Bark";
    }
    @Override
    public String feed() {
        return "Dog is omnivorous animal";
    }

}
