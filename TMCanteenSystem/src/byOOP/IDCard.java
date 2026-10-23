package byOOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class IDCard {
	private String id;
	private String name;
	private String role;
	private float balance;
	private Map<Item, Integer> inventory;
	private boolean buying;
	private Canteen canteen;
	
	IDCard(String n, String r, Canteen c){
		name = n;
		role = r;
		canteen = c;
		balance = 0;
		id = generateRandomId();
		buying = false;
	}
	
	public void scan() {
		boolean found = canteen.isIdRegistered(this);
		if(found) {
			System.out.println("Welcome " + name + "!\nYour Balance: " + balance);
			buying = true;
			inventory = new HashMap<>();
			inventory.clear();
		}else{
			System.out.println("ID Card Not Registered!");
		}
	}
	
	public void buy(Item i, int q) {
		if(buying) {
			float totalPrice = i.getPrice()*q;
			if(i.getStock()>= q && balance >= totalPrice) {
				inventory.put(i, q);
			}else {
				if(i.getStock()==0) {
					System.out.println(i.getName() + " is out of Stock");
				}
				if(balance< totalPrice) {
					System.out.println("Not enough Balance");
				}
			}
		}else {
			System.out.println("Please Scan your ID Card before Buying!");
		}
	}
	
	public String getId() {
		return id;
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
	
	public Canteen getCanteen() {
		return canteen;
	}

	public Map<Item, Integer> getInventory() {
		return inventory;
	}

	public boolean isBuying() {
		return buying;
	}

	public void checkBalance() {
		System.out.println(name + "'s Balance: " + balance);
	}
	public void done() {
		for(Entry<Item, Integer> m : inventory.entrySet()) {
			balance-= m.getKey().getPrice()* m.getValue();
			for(Item i : canteen.getItems()) {
				if(i == m.getKey()) {
					i.setStock((i.getStock())- (m.getValue()));
				}
			}
		}
		buying = false;
	}
	
	public void topUp(float amount) {
		balance+= amount;
	}
	
	@Override
	public String toString() {
		return "IDCard [id=" + id + ", name=" + name + ", role=" + role + ", balance=" + balance + ", inventory="
				+ inventory + ", buying=" + buying + "]";
	}

	private String generateRandomId() {
		Random r = new Random();
		StringBuilder s = new StringBuilder();
		for(int i = 0; i<10; i++) {
			s.append(r.nextInt(9));
		}
		return s.toString();
	}
	public void viewCart() {
		float total = 0;
		System.out.println("\nYour Cart: ");
		for(Entry<Item, Integer> e : inventory.entrySet()) {
			System.out.println(e.getKey().getName() + "    " + e.getKey().getPrice() + "  x" + e.getValue() + "  =   " + e.getKey().getPrice()*e.getValue());
			total+=e.getKey().getPrice()*e.getValue();
		}
		System.out.println("Total: " + total);
	}
}
