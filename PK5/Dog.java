package java22;

public class Dog implements Animal {
	String name;
	Dog(String  name){
		this.name= name;
	}
	
	 @Override
	    public void voice() {
	        System.out.println(name+" собака говирит гав");

	    }

	    @Override
	    public void feed() {
	        System.out.println(name+" собака ест котов)");

	    }
}
