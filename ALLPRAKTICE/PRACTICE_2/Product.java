package Task_3Practice;

public class Product {

   //fields
   private String Name;
   private int price;
   private int quantity;

   //getters & setters
   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
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

   //constructors
   public Product(String Name,int price,int quantity){
      this.Name = Name;
      this.price = price;
      this.quantity = quantity;
   }
}