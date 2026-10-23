package inhertancePractice;

public class Potion extends Item{
	private String name;
	private int healingAmount;
	private String effectType;
	
	public Potion(String name, float weight, int value, int rarity, int healingAmount, String effectType) {
		super(name, weight, value, rarity);
		// TODO Auto-generated constructor stub
		this.healingAmount = healingAmount;
		this.effectType = effectType;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHealingAmount() {
		return healingAmount;
	}
	public String getEffectType() {
		return effectType;
	}
	public void use (Characther characther) {
		characther.setHealth(healingAmount);
	}
	@Override
	public String toString() {
		return "Potion [healingAmount=" + healingAmount + ", effectType=" + effectType + "]";
	}
}
