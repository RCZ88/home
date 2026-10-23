package game;

public abstract class Ability {
	public String name;
	public int aoe;
	public int damage;
	public int heal;
	public Monster monster;
	
	public Ability(String name) {
		this.name = name;
	}
	public abstract void use(Monster from, Monster to);
	
	public void attack(Monster monster) {
		if(monster.health - damage >= 0) {
			monster.health -= damage;
		}else {
			monster.health = 0;
		}
		Monster.checkIfDead(monster);
	}
	public static void heal(Monster monster, int healAmount) {
		if(monster.health + healAmount <= monster.maxHealth) {
			monster.health += healAmount;
		}else {
			monster.health = monster.maxHealth;
		}
	}
}
