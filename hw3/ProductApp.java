package hw3;

public class ProductApp {

	public static void main(String[] args) {

		Product[] stock = new Product[4];
		stock[0] = new Product("Apples", 30.85, 70);
		stock[1] = new Product("Bananas", 25.89, 100);
		stock[2] = new Product("Tangerines", 40.85, 170);
		stock[3] = new Product("Tomatoes", 60.35, 90);
		
		Product highest = stock[0];
		for (Product product : stock) {
			if (product.getPrice() > highest.getPrice())
				highest = product;
		}
		System.out.println("The name and quantity of the most expensive item are: " + highest.getName()
		+ " , " + highest.getPrice());
		
		Product highestQuantity = stock[0];
		for (Product product : stock) {
			if (product.getQuantity() > highestQuantity.getQuantity())
				highestQuantity = product;
		}
		System.out.println("Product " + highestQuantity.getName() + " has the biggest quantity");
	}

}
