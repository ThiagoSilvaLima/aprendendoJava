package entities;

public class OrderItem {
	int quantity;
	double price;
	
	Product product;
	
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public double subTotal () {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return ""+product.name+ ", "+price+", Quantity: "+quantity+", Subtotal: "+ subTotal();
	}
	
	
	
}
