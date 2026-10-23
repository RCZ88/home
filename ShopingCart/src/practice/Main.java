package practice;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
    	 DiscountManager discountManager = new DiscountManager();
    	 
    	 discountManager.addDiscount("PERCENT20", "percentage", 20.0f);
         discountManager.addDiscount("FIXED10", "fixedAmount", 10.0f);
         
         Product laptop = new Product(1, "Laptop", "Powerful laptop", 1000.0f, 10, "Electronics", "BrandA");
         Product smartphone = new Product(2, "Smartphone", "High-end smartphone", 800.0f, 20, "Electronics", "BrandB");

         // Creating a shopping cart
         ShoppingCart cart = new ShoppingCart();

         // Adding items to the cart
         cart.addItem(laptop, 2);
         cart.addItem(smartphone, 3);

         // Displaying cart items
         System.out.println("Cart Items:");
         for (CartItem item : cart.getCartItems()) {
             System.out.println(item);
         }

         // Applying a percentage discount
         cart.applyDiscount("FIXED10");

         // Displaying total cost after discount
         System.out.println("Total Cost after Discount: " + cart.getTotalCost());

         // Setting shipping cost and payment method
         cart.setShippingCost(10.0f);
         cart.setPaymentMethod("Credit Card");

         // Displaying cart details
         System.out.println("Cart Details:");
         System.out.println(cart);

         // Updating quantity of a product in the cart
         cart.updateQuantity(laptop, 1);

         // Displaying updated cart items
         System.out.println("Updated Cart Items:");
         for (CartItem item : cart.getCartItems()) {
             System.out.println(item);
         }

         // Clearing the cart
         cart.clearCart();

         // Displaying cleared cart
         System.out.println("Cleared Cart Items:");
         for (CartItem item : cart.getCartItems()) {
             System.out.println(item);
         }
         ArrayList <Discount> discounts = discountManager.getDiscounts();
         for(Discount discount: discounts) {
        	 System.out.println(discount.getAmount()+ " " + discount.getCode());
         }
         //System.out.println(discountManager.findDiscountByCode("E").getCode());
    }
}