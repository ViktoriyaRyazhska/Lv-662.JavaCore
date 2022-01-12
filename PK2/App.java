package java8;

public class App {
	public static void main(String[] args) {
        Product p1 = new Product("Apple", 10, 50);
        Product p2 = new Product("Lemon", 8, 100);
        Product p3 = new Product("Peach", 12, 76);
        Product p4 = new Product("Cherry", 15, 234);
	
	if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
        System.out.println(p1.getName() + " "+p1.getQuantity());
    } else if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()) {
        System.out.println(p2.getName() + " "+p2.getQuantity());
    } else if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice() && p3.getPrice() > p4.getPrice()) {
        System.out.println(p3.getName() + " "+p3.getQuantity());
    } else {
        System.out.println(p4.getName() + " "+p4.getQuantity());
    }
    if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity() && p1.getQuantity() > p4.getQuantity()) {
        System.out.println("the biggest quantity: " + p1.getName());
    } else if (p2.getQuantity() > p1.getQuantity() && p2.getQuantity() > p3.getQuantity() && p2.getQuantity() > p4.getQuantity()) {
        System.out.println("the biggest quantity: " + p2.getName());
    } else if (p3.getQuantity() > p1.getQuantity() && p3.getQuantity() > p2.getQuantity() && p3.getQuantity() > p4.getQuantity()) {
        System.out.println("the biggest quantity: " + p3.getName());
    } else {
        System.out.println("the biggest quantity: " + p4.getName());
    }
}
}