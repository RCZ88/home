package inhertancePractice;

public class Armor extends Item{
	private String name;
	private int defese;
	private String defenseType;
	
	public Armor(String name, float weight, int value, int rarity, int defense, String defenseType) {
		super(name, weight, value, rarity);
		this.defese = defense;
		this.defenseType = defenseType;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getDefese() {
		return defese;
	}

	public String getDefenseType() {
		return defenseType;
	}

	public void use(Characther characther) {
		// TODO Auto-generated method stub
		characther.setDefense(defese);
	}
	@Override
	public String toString() {
		return "Armor [defese=" + defese + ", defenseType=" + defenseType + "]";
	}
	

}
