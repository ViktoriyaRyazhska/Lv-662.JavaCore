package lesson_3;


public class Product_main {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("lipstick");
		p1.setPrice(10);
		p1.setQuantity(177);

		Product p2 = new Product();
		p2.setName("blush");
		p2.setPrice(10);
		p2.setQuantity(178);

		Product p3 = new Product();
		p3.setName("mascara");
		p3.setPrice(70);
		p3.setQuantity(179);

		Product p4 = new Product();
		p4.setName("powder");
		p4.setPrice(10);
		p4.setQuantity(200);

		//Display the name and quantity of the most expensive item
		
		if (p1.getPrice() >= p2.getPrice() & p1.getPrice() >= p3.getPrice() & p1.getPrice() >= p4.getPrice()) {
			System.out.println("The most expensive item is " + p1.getName() + " and quantity -  " + p1.getQuantity());
		}

		if (p2.getPrice() >= p1.getPrice() & p2.getPrice() >= p3.getPrice() & p2.getPrice() >= p4.getPrice()) {
			System.out.println("The most expensive item is " + p2.getName() + " and quantity -  " + p2.getQuantity());
		}

		if (p3.getPrice() >= p1.getPrice() & p3.getPrice() >= p2.getPrice() & p3.getPrice() >= p4.getPrice()) {
			System.out.println("The most expensive item is " + p3.getName() + " and quantity -  " + p3.getQuantity());
		}

		if (p4.getPrice() >= p1.getPrice() & p4.getPrice() >= p2.getPrice() & p4.getPrice() >= p3.getPrice()) {
			System.out.println("The most expensive item is " + p4.getName() + " and quantity -  " + p4.getQuantity());
		}
		
		//Display the name of the items, which has the biggest quantity
		
		if (p1.getQuantity() >= p2.getQuantity() & p1.getQuantity() >= p3.getQuantity() & p1.getQuantity() >= p4.getQuantity()) {
			System.out.println(p1.getName() + " is the item, which has the biggest quantity");
		}
		
		if (p2.getQuantity() >= p1.getQuantity() & p2.getQuantity() >= p3.getQuantity() & p2.getQuantity() >= p4.getQuantity()) {
			System.out.println(p2.getName() + " is the item, which has the biggest quantity");
		}
		
		if (p3.getQuantity() >= p1.getQuantity() & p3.getQuantity() >= p2.getQuantity() & p3.getQuantity() >= p4.getQuantity()) {
			System.out.println(p3.getName() + " is the item, which has the biggest quantity");
		}
		
		if (p4.getQuantity() >= p1.getQuantity() & p4.getQuantity() >= p2.getQuantity() & p4.getQuantity() >= p3.getQuantity()) {
			System.out.println(p4.getName() + " is the item, which has the biggest quantity");
		}
	}


}
