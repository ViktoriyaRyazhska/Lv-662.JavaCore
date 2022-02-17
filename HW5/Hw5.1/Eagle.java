package java20;

public class Eagle extends FlyingBird{
	String feathers = "чёрный";
	int layEggs = 5;
	
	@Override
	public String toString() {
		return "Орёл " + feathers + ",откладывает " + layEggs + " яиц ";
}
}