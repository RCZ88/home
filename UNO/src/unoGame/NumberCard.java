package unoGame;

public class NumberCard extends Card{
	private int number;
	private String color;
	
	public NumberCard(int number, String color) {
		this.number = number;
		this.color = color;
	}

	public int getNumber() {
		return number;
	}

	public String getColor() {
		return color;
	}
}
