package l6HWQ1;

public class Main {

	public static void main(String[] args) {
		Swallow swallow = new Swallow();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		Chicken chicken = new Chicken();
		
		Bird[] birds  = {swallow, eagle, penguin, chicken};
		for (Bird b : birds) {
			System.out.println("Type: " + b.getType());
			System.out.println("-Has " + b.getFeathers() + " coloured feathers.");
			System.out.println("-Lays " + b.getEggs() + " egg at a time.");
			System.out.println("-Flies? " + b.fly());
		}

	}

}
