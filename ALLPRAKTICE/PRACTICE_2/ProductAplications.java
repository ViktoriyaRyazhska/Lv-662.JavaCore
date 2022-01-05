package Task_3Practice;
public class ProductAplications {
    public static void main(String[] args) {
        int x = 0;
        Product pr1 = new Product("Table", 4000, 5);
        Product pr2 = new Product("Chair", 500, 20);
        Product pr3 = new Product("Window", 2500, 6);
        Product pr4 = new Product("Door", 1600, 2);

        if(pr1.getPrice()>pr2.getPrice() && pr1.getPrice()>pr3.getPrice() && pr1.getPrice()>pr4.getPrice() ){
            System.out.println(pr1.getName() + " , " + pr1.getQuantity());
        }else if (pr2.getPrice()>pr1.getPrice() && pr2.getPrice()>pr3.getPrice() && pr2.getPrice()>pr4.getPrice()){
            System.out.println(pr2.getName() + " , " + pr2.getQuantity());
        }else if (pr3.getPrice()>pr1.getPrice() && pr3.getPrice()>pr2.getPrice() && pr3.getPrice()>pr4.getPrice()) {
            System.out.println(pr3.getName() + " , " + pr3.getQuantity());
        }else{
            System.out.println(pr4.getName() + " , " + pr4.getQuantity());
        }
        if(pr1.getQuantity()> pr2.getQuantity() && pr1.getQuantity()> pr3.getQuantity() && pr1.getQuantity()> pr4.getQuantity()) {
            System.out.println(pr1.getName());
        }else if(pr2.getQuantity()> pr1.getQuantity() && pr2.getQuantity()> pr3.getQuantity() && pr2.getQuantity()> pr4.getQuantity()){
            System.out.println(pr2.getName());
        }else if(pr3.getQuantity()> pr1.getQuantity() && pr3.getQuantity()> pr2.getQuantity() && pr3.getQuantity()> pr4.getQuantity()) {
            System.out.println(pr3.getName());
        }else {
            System.out.println(pr4.getName());
        }
    }
}
