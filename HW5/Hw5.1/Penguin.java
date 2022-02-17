package java20;

public class Penguin extends NonFlyingBird{
	String feathers = "чёрно-белый";
	int layEggs = 6;
	
	@Override
	public String toString() {
		return "Пингвин " + feathers + ", откладывает" + layEggs + " яиц";
}
}