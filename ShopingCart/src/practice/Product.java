package practice;

public class Product {
	private int id;
	private String name;
	private String description;
	private float price;
	private int stock;
	private String category;
	private String brand;
	
	Product (int id, String name, String description, float price, int stock, String category, String brand){
		this.id = id;
		this.name = name; 
		this.description = description;
		this.price = price;
		this.stock = stock; 
		this.category = category;
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public float getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public String getCategory() {
		return category;
	}
	public String getBrand() {
		return brand;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean checkStock(int quantity) {
		if(quantity >= stock) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return "Name: "+ name + " ID: "+ id + " Brand: "+ brand+ " Price: "+ price + " Stock: "+ stock;
	}
}
