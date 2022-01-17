package hw5.homework_1;

public class Swallow extends FlyingBird {

	public Swallow(boolean layEggs) {
		this.feathers = true;
		this.layEggs = layEggs;
	}

	@Override
	public void fly() {
		if (layEggs) {
			System.out.println("Hi! I am a swallow. I can fly and lay eggs.");
		} else {
			System.out.println("Hi! I am a swallow. I can fly but I can't lay eggs. Because I am a male.");
		}
	}
}
