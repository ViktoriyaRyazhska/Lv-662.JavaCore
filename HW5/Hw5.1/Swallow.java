package java20;

public class Swallow extends FlyingBird{
	String feathers = "чёрно-белая";
	int layEggs = 6;
	
	@Override
	public String toString() {
		return "Ласточка  " + feathers + ",откладывает " + layEggs + " яиц ";
}
}
