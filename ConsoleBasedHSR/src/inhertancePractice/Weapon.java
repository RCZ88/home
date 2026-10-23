package inhertancePractice;

public class Weapon extends Item{
	private String name;
	private int attackPower;
	private int attackRange; 
	private int manaCost;
	
	
	public Weapon(String name, float weight, int value, int rarity, int attackPower, int attackRange, int manaCost) {
		super(name, weight, value, rarity);
		// TODO Auto-generated constructor stub
		this.attackPower = attackPower;
		this.attackRange = attackRange;
		this.name = name;
		this.manaCost = manaCost;
	}
	
	public void use(Characther characther, Characther target) {
		// TODO Auto-generated method stub
		if(characther.getMana() >= manaCost) {
			
		}
		target.setHealth(target.getHealth() - (attackPower - target.getDefense()));
	}
	
	
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", attackPower=" + attackPower + ", attackRange=" + attackRange + ", manaCost="
				+ manaCost + "]";
	}

	public String getName() {
		return name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getAttackRange() {
		return attackRange;
	}
	
}
