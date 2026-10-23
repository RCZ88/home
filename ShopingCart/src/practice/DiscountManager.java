package practice;
import java.util.ArrayList;

import practice.Discount.AmountDiscount;
import practice.Discount.PercentageDiscount;

public class DiscountManager {
    private ArrayList<Discount> discounts = new ArrayList<>();
    
    public void addDiscount(String code, String type, float amount) {
        if (type.equals("percentage")) {
            discounts.add(new PercentageDiscount(code, amount));
        } else if (type.equals("fixedAmount")) {
            discounts.add(new AmountDiscount(code, amount));
        } else {
            System.out.println("Error! Code not Found!");
        }
    }
    public Discount findDiscountByCode(String code) {
        for (Discount discount : discounts) {
            System.out.println("Comparing: " + discount.getCode() + " with " + code);
            if (discount.getCode().equals(code)) {
                return discount;
            }
        }
        return null;
    }
    public ArrayList<Discount> getDiscounts() {
        return discounts;
    }
}

