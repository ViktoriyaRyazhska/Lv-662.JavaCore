package WrapperT;

public class Wrapper<T> {
	
	private T value;
	
	
	@Override
	public String toString() {
		return "Wrapper [value=" + value + "]";
	}

	public Wrapper() {
		
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		
		Wrapper<Integer> intObj = new Wrapper<>();
		intObj.setValue(8);
		Wrapper<String> stringObj = new Wrapper<>();
		stringObj.setValue("String value");
		Wrapper<Boolean> boolObj = new Wrapper<>();
		boolObj.setValue(true);
		
		System.out.println(intObj.getValue());
		System.out.println(stringObj.getValue());
		System.out.println(boolObj.getValue());
		
		
		System.out.println(intObj.toString());
	}
}


//int a = 10;		
//Integer intobg = new Integer(a);
//String b = "object b";
//String strobg = new String(b);
//boolean c = true;
//Boolean boolobg = new Boolean(c);
//
//System.out.println(intobg + ", " + strobg + ", " + boolobg);
