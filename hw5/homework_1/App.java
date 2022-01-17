package hw5.homework_1;

public class App {
	
	public static void main(String[] args) {
		
		Bird[] birds = new Bird[4];
		
		birds[0] = new Kiwi(true);
		birds[1] = new Swallow(true);
		birds[2] = new Penguin(true);
		birds[3] = new Eagle(false);
		
		for (Bird bird : birds) {
			
			bird.fly();
			
		}
		
	}

}
