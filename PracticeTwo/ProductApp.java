package PracticeTwo;

public class ProductApp {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 3000, 10);
        Product p2 = new Product("Laptop", 5000, 8);
        Product p3 = new Product("PC", 10000, 3);
        Product p4 = new Product("vacuum cleaner", 2000, 12);

        if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
            System.out.println(p1.getName() + " , " + p1.getQuantity());
        } else if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()) {
            System.out.println(p2.getName() + " , " + p2.getQuantity());
        } else if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice() && p3.getPrice() > p4.getPrice()) {
            System.out.println(p3.getName() + " , " + p3.getQuantity());
        } else {
            System.out.println(p4.getName() + " , " + p4.getQuantity());
        }
        if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity() && p1.getQuantity() > p4.getQuantity()) {
            System.out.println("biggest quantity item: " + p1.getName());
        } else if (p2.getQuantity() > p1.getQuantity() && p2.getQuantity() > p3.getQuantity() && p2.getQuantity() > p4.getQuantity()) {
            System.out.println("biggest quantity item: " + p2.getName());
        } else if (p3.getQuantity() > p1.getQuantity() && p3.getQuantity() > p2.getQuantity() && p3.getQuantity() > p4.getQuantity()) {
            System.out.println("biggest quantity item: " + p3.getName());
        } else {
            System.out.println("biggest quantity item: " + p4.getName());
        }
    }
}