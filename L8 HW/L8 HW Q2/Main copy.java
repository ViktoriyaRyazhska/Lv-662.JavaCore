package l8HWQ2;

public class Main {

	public static void main(String[] args) {
		Wrapper<Integer> number = new Wrapper<>();
		number.setValue(1);
		System.out.println("First Value: " + number.getValue());
		System.out.println("*********************");
		
		Wrapper<String> string = new Wrapper<>();
		string.setValue("Hello. World");
		System.out.println("Second Value: " + string.getValue());
		System.out.println("*********************");
		
		Wrapper<Boolean> bool = new Wrapper<>();
		bool.setValue(true);
		System.out.println("Third Value: " + bool.getValue());

	}

}
