package hw7.practice_2;

public class Wrapper <T extends Shape> implements Shape {

	private T t;

	public Wrapper(T t) {
		this.t = t;
	}

	@Override
	public void identify() {
		t.identify();
	}
	
	
		
}
