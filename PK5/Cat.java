package java22;

public class Cat implements Animal {
	String name;
	Cat(String  name){
		this.name= name;
	}
	 @Override
	    public void voice() {
	        System.out.println(name+" кошка говорит мяу");

	    }

	    @Override
	    public void feed() {
	        System.out.println(name+" кошка ест собак)");

	    }
}
