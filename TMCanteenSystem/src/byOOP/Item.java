package byOOP;

public class Item {
	private String name;
	private float price;
	private int stock;
	
	Item(String n, float p, int s){
		name = n;
		price = p;
		stock = s;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
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
}
