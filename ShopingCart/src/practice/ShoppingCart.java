package practice;
import java.util.ArrayList;
public class ShoppingCart {
	private ArrayList <CartItem> items = new ArrayList<>();
	private float shippingCost;
	private String paymentMethod;
	private float totalCost;
	DiscountManager discountManager = new DiscountManager();
	
	public void addItem(Product product, int quantity) {
		items.add(new CartItem(product, quantity));
	}
	public void removeItem(Product product) {
		for(CartItem item: items) {
			if(item.getProduct().equals(product)) {
				items.remove(item);
			}
		}
	}
	public void updateQuantity(Product product, int quantity) {
		for(CartItem item: items) {
			if(item.getProduct().equals(product)) {
				item.setQuantity(quantity);
			}
		}
	}
	public ArrayList<CartItem> getCartItems() {
		return new ArrayList<>(items);
	}
	public float getTotalCost() {
		float totalCost = 0;
		for(CartItem item: items) {
			totalCost+= item.getQuantity()* item.getProduct().getPrice();
		}
		return totalCost;
	}
	public void applyDiscount(String code) {
	    System.out.println("Applying discount for code: " + code);
	    Discount discount = discountManager.findDiscountByCode(code);

	    if (discount != null) {
	        float discountAmount = discount.calculateDiscount(this);
	        totalCost = getTotalCost() - discountAmount;
	    } else {
	        System.out.println("Discount not found for code: " + code);
	    }
	}
	public void setShippingCost(float shippingCost) {
		this.shippingCost = shippingCost;
	}
	public void setPaymentMethod (String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void clearCart() {
		items.clear();
	}
	public float getShippingCost() {
		return shippingCost;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public String toString() {
		return "ShoppingCart: \n" + items.toString();
	}
}
