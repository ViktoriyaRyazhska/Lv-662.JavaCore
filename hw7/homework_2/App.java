package hw7.homework_2;

public class App {
	
	public static void main(String[] args) {
		
		Wrapper<Integer> integerWrapper = new Wrapper<>(55);
		Wrapper<String> stringWrapper = new Wrapper<>("A string");
		Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);
		
		System.out.println(integerWrapper.getValue());
		System.out.println(stringWrapper.getValue());
		System.out.println(booleanWrapper.getValue());
		
	}

}
