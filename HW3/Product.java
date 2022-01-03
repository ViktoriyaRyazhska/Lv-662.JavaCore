package l4;

public class Product {
	public String name;
	public int price;
	public int quantity;
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setName("Doll");
		p1.setPrice(25);
		p1.setQuantity(2);
		
		Product p2 = new Product();
		p2.setName("Ball");
		p2.setPrice(12);
		p2.setQuantity(5);
		
		Product p3 = new Product();
		p3.setName("Phone");
		p3.setPrice(48);
		p3.setQuantity(3);
		
		Product p4 = new Product();
		p4.setName("Car");
		p4.setPrice(23);
		p4.setQuantity(13);
		
		// Display the name and quantity of the most expensive item.
		
		if (p1.getPrice() >= p2.getPrice() & p1.getPrice() >= p3.getPrice() & p1.getPrice() >= p4.getPrice()) {
		    System.out.println("The most expencive toy is " + p1.getName() + ". " + "The price is " + p1.getPrice() + ".");
		 }
		
		if (p2.getPrice() >= p1.getPrice() & p2.getPrice() >= p3.getPrice() & p2.getPrice() >= p4.getPrice()) {
		    System.out.println("The most expencive toy is " + p2.getName() + ". " + "The price is " + p2.getPrice() + ".");	
		 }
		if (p3.getPrice() >= p1.getPrice() & p3.getPrice() >= p2.getPrice() & p3.getPrice() >= p4.getPrice()) {
			System.out.println("The most expencive toy is " + p3.getName() + ". " + "The price is " + p3.getPrice() + ".");
		 }
		
		if (p4.getPrice() >= p1.getPrice() & p4.getPrice() >= p2.getPrice() & p4.getPrice() >= p3.getPrice()) {
			System.out.println("The most expencive toy is " + p4.getName() + ". " + "The price is " + p4.getPrice() + ".");
		 }
		
		
	    // Display the name of the items, which has the biggest quantity.
		 if (p1.getQuantity() >= p2.getQuantity() & p1.getQuantity() >= p3.getQuantity() & p1.getQuantity() >= p4.getQuantity()) {
		    System.out.println(p1.getName() + " is the most numerous item. It's quantity is " + p1.getQuantity() + ".");
		 }
		 
		 if (p2.getQuantity() >= p1.getQuantity() & p2.getQuantity() >= p3.getQuantity() & p2.getQuantity() >= p4.getQuantity()) {
			    System.out.println(p1.getName() + " is the most numerous item. It's quantity is " + p2.getQuantity() + ".");
			 }
		
		 if (p3.getQuantity() >= p1.getQuantity() & p3.getQuantity() >= p2.getQuantity() & p3.getQuantity() >= p4.getQuantity()) {
			    System.out.println(p1.getName() + " is the most numerous item. It's quantity is " + p3.getQuantity() + ".");
			 }
		 
		 if (p4.getQuantity() >= p1.getQuantity() & p4.getQuantity() >= p2.getQuantity() & p4.getQuantity() >= p3.getQuantity()) {
			    System.out.println(p1.getName() + " is the most numerous item. It's quantity is " + p4.getQuantity() + ".");
			 }
		
		}
		
		}
	
		

	


