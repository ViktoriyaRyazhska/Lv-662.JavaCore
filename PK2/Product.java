package java10;

	public class Product {
		private String name;
		private int price;
		private int quantity;

		public Product(String name, int price,int quantity) {
			this.name = name;
			this.price = price;
			this.quantity=quantity;

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
		public int setPrice(int price) {
			return price;
		}
		public int getQuantity() {
			return quantity;
		}
		public int setQuantity(int quantity) {
			return quantity;
		}
}

