package unoGame;

public class SpecialCard extends Card{
	private String ability;
	
	public SpecialCard(String ability) {
		this.ability = ability;
	}

	public String getAbility() {
		return ability;
	}
}
