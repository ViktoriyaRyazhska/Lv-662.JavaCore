package hw5.homework_1;

public class Penguin extends NonFlyingBird {

	public Penguin(boolean layEggs) {
		this.feathers = false;
		this.layEggs = layEggs;
	}

	@Override
	public void fly() {
		if (layEggs) {
			System.out.println("Hi! I am a penguin. I can't fly, but I can lay eggs.");
		} else {
			System.out.println("Hi! I am a penguin. I can't fly and lay eggs. Because I am a male.");
		}
	}
}
