package mullyINC;
import java.util.UUID;

public class Item {
	private UUID id;
	private String name;
	private int quantity;
	private double price;
	public Item(String n, int q, double p) {
		id = UUID.randomUUID();
		name = n;
		quantity = q;
		price = p;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id.toString();
	}
	public void addQuantity(int amount) {
		quantity += amount;
	}
	public void editPrice(double price) {
		this.price = price;
	}
}
