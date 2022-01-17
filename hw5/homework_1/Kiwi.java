package hw5.homework_1;

public class Kiwi extends NonFlyingBird {

	public Kiwi(boolean layEggs) {
		this.feathers = true;
		this.layEggs = layEggs;
	}

	@Override
	public void fly() {
		if (layEggs) {
			System.out.println("Hi! I am a kiwi. I can't fly, but I can lay eggs.");
		} else {
			System.out.println("Hi! I am a kiwi. I can't fly and lay eggs. Because I am a male.");
		}
	}
}
