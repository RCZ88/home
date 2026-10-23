package practice;

public abstract class Discount {
    private float amount;
    private String codes;

    public Discount(float amount, String codes) {
        this.amount = amount;
        this.codes = codes;
    }

    public float getAmount() {
        return amount;
    }
    public String getCode() {
    	return codes;
    }
    
    public abstract float calculateDiscount(ShoppingCart cart);

    public static class PercentageDiscount extends Discount {
        public PercentageDiscount(String codes, float amount) {
            super(amount, codes);
        }

        @Override
        public float calculateDiscount(ShoppingCart cart) {
            float discount = getAmount() / 100f * cart.getTotalCost();
            return discount;
        }
    }

    public static class AmountDiscount extends Discount {
        public AmountDiscount(String codes, float amount) {
            super(amount, codes);
        }

        @Override
        public float calculateDiscount(ShoppingCart cart) {
            return getAmount();
        }
    }
}