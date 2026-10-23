package game;
import java.util.*;

public class Monster {
	public Arena arena;
	public Match match;
	public static final int ICE_MONSTER_TYPE = 1;
	public static final int WATER_MONSTER_TYPE = 2;
	public static final int FIRE_MONSTER_TYPE = 3;
	public static final int [][] effectiveness = {{0,-4,2} , {-8,0,5} , {6,-3,0}};
	public Ability[]abilities;
	public String name;
	public int health;
	public int maxHealth;
	public int strength;
	public int currentDice;
	public int monsterType = 0;
	public boolean alive = true;
	public Monster(String name, int health, int monsterType, HealAbility ha, TypeAbility ta, SignatureAbility sa) {
		this.name = name;
		this.maxHealth = health;
		this.health = health;
		this.monsterType = monsterType;
		abilities = new Ability[3];
		abilities[0] = ha;
		abilities[1] = ta;
		abilities[2] = sa;
	}
	public void useAbility(int ability) {
		if(ability == 1) {
			abilities[0].use(this, this);
		}
	}
	public void useAbility(int ability, Monster target) {
		if(ability > 1 && ability < abilities.length) {
			abilities[ability-1].use(this, target);
		}
	}
	public void attack(Monster defender) {
		int damage = currentDice + getAttackingWeight(this, defender);
		defender.health -= damage;
		Turn t = new Turn(Turn.turnCount+1, "Basic Attack", this, defender, damage, false);
		Turn.turnCount++;
		match.gameLog.add(t);
	}

	public static int getAttackingWeight(Monster attacker, Monster defender) {
		return effectiveness[attacker.monsterType-1][defender.monsterType-1];
	}
	public void rollDice() {
		Random r = new Random();
		this.currentDice = r.nextInt(12)+2;
		((HealAbility) abilities[0]).setHeal(this.currentDice);
	}
	
	public static void checkIfDead(Monster monster) {
		if(monster.health <= 0) {
			System.out.println(monster.name + " Is DEAD!");
		}
	}
}

