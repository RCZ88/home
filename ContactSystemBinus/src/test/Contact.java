package test;

public class Contact {
	private String name;
	private int number;
	private String description;
	
	public Contact(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public Contact(String name, int number, String description) {
		this.name = name;
		this.number = number;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getDescription() {
		return description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
