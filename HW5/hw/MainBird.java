package hw;

public class MainBird {
	
	public static void main(String[] args) {
		
		Bird[] birds =  new Bird[4];
		birds[0] = new Eagle();
		birds[1]  = new Swallow();
		birds[2] = new Penguin();
		birds[3] = new Chicken();
		
		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i] + "Is it true, that it can fly? " + birds[i].fly());
		}
		
	}

}
