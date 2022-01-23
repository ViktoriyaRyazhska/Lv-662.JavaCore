package java22;

public class Main {
	
	    public static void main(String[] args) {

	        Animal arr[] = new Animal[2];
	        arr[0] = new Dog("Мартин");
	        arr[1] = new Cat("Ириса");


	        for (int i = 0; i < arr.length; i++) {
	            arr[i].voice();
	            arr[i].feed();
}
	        System.out.println("Но Мартин и Ириса не едят друг друга!");
}
}