package prTask_6_p2;

public abstract class Staff extends Person{

    public abstract int salary();



    public Staff(String name, int salary) {
        super(name);
        this.getSalary();
    }



    public int getSalary(){
        return salary();
    }

}
