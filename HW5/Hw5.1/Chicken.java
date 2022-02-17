package java20;

public class Chicken extends NonFlyingBird{
	String feathers = "коричневая";
	int layEggs = 12;
	
	@Override
	public String toString() {
		return "Курица " + feathers + ",откладывает" + layEggs + " яиц ";
}
}