package java23;

public abstract class Staff extends Person{
	int salary;

    public Staff(String name) {
        super(name);
    }

    abstract void salary();

}
