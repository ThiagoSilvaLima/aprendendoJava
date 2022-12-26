package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
		
		public String toString() {
			return String.format("%s, $%.2f, %d stock, total: %.2f\n",name,price,quantity, price * quantity);
		}
		public void addQNTY(int qnty ) {
			this.quantity += qnty;
			
		}
		public void decrementQNTY(int qnty) {
			this.quantity -= qnty;
			
		}
		
}