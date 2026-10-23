package unoGame;

public class SpecialColor extends Card{
	private String color;
	private String ability;
	
	public SpecialColor(String color, String ability) {
		this.color = color;
		this.ability = ability;
	}
	
	public String getColor() {
		return color;
	}
	public String getAbility() {
		return ability;
	}
}
