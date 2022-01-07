package hw3;

public class ProductApp {
    public static void main(String[] args) {
        String expensive = "The most expensive item is: ";
        String quantity = "Item with the biggest quantity is: ";

        Product p1 = new Product();
        p1.setName("Potato");
        p1.setPrice(8.5);
        p1.setQuantity(30);

        Product p2 = new Product();
        p2.setName("Carrot");
        p2.setPrice(6.6);
        p2.setQuantity(35);

        Product p3 = new Product();
        p3.setName("Garlic");
        p3.setPrice(9.2);
        p3.setQuantity(38);

        Product p4 = new Product();
        p4.setName("Onion");
        p4.setPrice(5.4);
        p4.setQuantity(45);

        // Print most expensive item
        if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
            System.out.println(expensive + p1.getName() + " with " + p1.getQuantity() + " items");
        } else if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()) {
            System.out.println(expensive + p2.getName() + " with " + p2.getQuantity() + " items");
        } else if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice() && p3.getPrice() > p4.getPrice()) {
            System.out.println(expensive + p3.getName() + " with " + p3.getQuantity() + " items");
        } else if (p4.getPrice() > p1.getPrice() && p4.getPrice() > p2.getPrice() && p4.getPrice() > p3.getPrice()) {
            System.out.println(expensive + p4.getName() + " with " + p4.getQuantity() + " items");
        } else {
            System.out.println("Program error");
        }

        // Print item with the biggest quantity
        if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity() && p1.getQuantity() > p4.getQuantity()) {
            System.out.println(quantity + p1.getName());
        } else if (p2.getQuantity() > p1.getQuantity() && p2.getQuantity() > p3.getQuantity() && p2.getQuantity() > p4.getQuantity()) {
            System.out.println(quantity + p2.getName());
        } else if (p3.getQuantity() > p1.getQuantity() && p3.getQuantity() > p2.getQuantity() && p3.getQuantity() > p4.getQuantity()) {
            System.out.println(quantity + p3.getName());
        } else if (p4.getQuantity() > p1.getQuantity() && p4.getQuantity() > p2.getQuantity() && p4.getQuantity() > p3.getQuantity()){
            System.out.println(quantity + p4.getName());
        } else {
            System.out.println("Program error");
        }
    }
}
