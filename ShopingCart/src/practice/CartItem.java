package practice;

public class CartItem {
	private Product product;
	private int quantity;
	private float unitPrice;
	private float totalPrice;
	
	CartItem(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
		calculateTotalPrice();
	}
	
	public Product getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		calculateTotalPrice();
	}
	private void calculateTotalPrice() {
		this.totalPrice = quantity * product.getPrice();
	}
	public String toString() {
		return "Product: "+ product + " Quantity: " + quantity + " Unit Price:" + unitPrice + "Total Price: " + totalPrice;
	}
}
