package byProceedural;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CanteenSystem {
    private static ArrayList<Item> items = new ArrayList<>();
    private static ArrayList<IDCard> ids = new ArrayList<>();

    public static void main(String[] args) {
    	long startTime = System.nanoTime();
        initializeItems();
        initializeIDCards();
        displayIDCardDetails();

        // Top-up balances
        topUpBalance(ids.get(0), 800000);
        topUpBalance(ids.get(1), 50000);
        topUpBalance(ids.get(4), 120000);

        displayCanteenItems();

        // Simulate transactions
        simulateTransaction(ids.get(1), items.get(5), 2);
        simulateTransaction(ids.get(1), items.get(1), 5);
        simulateTransaction(ids.get(1), items.get(2), 3);
        displayCart(ids.get(1));
        checkout(ids.get(1));

        displayCanteenItems();

        simulateTransaction(ids.get(2), items.get(0), 3);
        simulateTransaction(ids.get(2), items.get(0), 3);
        simulateTransaction(ids.get(2), items.get(1), 1);
        simulateTransaction(ids.get(2), items.get(3), 2);
        displayCart(ids.get(2));
        checkout(ids.get(2));

        displayCanteenItems();

        // Simulate scan without registering ID
        simulateTransaction(ids.get(0), items.get(2), 4);
        long stopTime = System.nanoTime();
        
        long timeTaken = stopTime-startTime;
        System.out.println("Time taken: " + timeTaken  + " Nano Seconds");
    }

    private static void initializeItems() {
        items.add(new Item("Gyudon Garlic Butter", 35000, 7));
        items.add(new Item("Currie Udon", 37500, 5));
        items.add(new Item("Aqua Water", 5000, 20));
        items.add(new Item("Kebab Ayam", 25000, 10));
        items.add(new Item("Karage", 30000, 20));
        items.add(new Item("Susu Coklat Milo", 7000, 15));
    }

    private static void initializeIDCards() {
        ids.add(new IDCard("Howard Soputan", "Student"));
        ids.add(new IDCard("Jennifer Tan", "Student"));
        ids.add(new IDCard("Michael Lee", "Student"));
        ids.add(new IDCard("Sarah Wong", "Teacher"));
        ids.add(new IDCard("Kevin Chen", "Teacher"));
    }

    private static void displayIDCardDetails() {
        for (IDCard id : ids) {
            System.out.println(id);
        }
    }

    private static void topUpBalance(IDCard id, float amount) {
        id.setBalance(id.getBalance() + amount);
    }

    private static void displayCanteenItems() {
        System.out.println("---Canteen System---");
        for (Item item : items) {
            System.out.println(item.getName() + "\nRp. " + item.getPrice());
            if (item.getStock() > 0) {
                System.out.println("Stock: " + item.getStock());
            } else {
                System.out.println("Out of Stock!");
            }
            System.out.println("");
        }
    }

    private static void simulateTransaction(IDCard id, Item item, int quantity) {
        float totalPrice = item.getPrice() * quantity;
        if (item.getStock() >= quantity && id.getBalance() >= totalPrice) {
            id.getInventory().put(item, quantity);
        } else {
            if (item.getStock() == 0) {
                System.out.println(item.getName() + " is out of Stock");
            }
            if (id.getBalance() < totalPrice) {
                System.out.println("Not enough Balance");
            }
        }
    }

    private static void displayCart(IDCard id) {
        float total = 0;
        System.out.println("\nYour Cart: ");
        for (Map.Entry<Item, Integer> entry : id.getInventory().entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(item.getName() + "    " + item.getPrice() + "  x" + quantity + "  =   " + item.getPrice() * quantity);
            total += item.getPrice() * quantity;
        }
        System.out.println("Total: " + total);
    }

    private static void checkout(IDCard id) {
        for (Map.Entry<Item, Integer> entry : id.getInventory().entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            item.setStock(item.getStock() - quantity);
        }
        id.setBalance(id.getBalance() - calculateTotal(id));
        id.getInventory().clear();
    }

    private static float calculateTotal(IDCard id) {
        float total = 0;
        for (Map.Entry<Item, Integer> entry : id.getInventory().entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            total += item.getPrice() * quantity;
        }
        return total;
    }

}

class IDCard {
    private String name;
    private String role;
    private float balance;
    private Map<Item, Integer> inventory;

    IDCard(String n, String r) {
        name = n;
        role = r;
        balance = 0;
        inventory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public float getBalance() {
        return balance;
    }

    public Map<Item, Integer> getInventory() {
        return inventory;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "IDCard [name=" + name + ", role=" + role + ", balance=" + balance + "]";
    }
}

class Item {
    private String name;
    private float price;
    private int stock;

    Item(String n, float p, int s) {
        name = n;
        price = p;
        stock = s;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
