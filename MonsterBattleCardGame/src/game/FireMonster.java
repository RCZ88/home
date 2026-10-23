package game;

public class FireMonster extends Monster{

	public FireMonster(String name, int health, int monsterType, SignatureAbility sa) {
		super(name, health, Monster.FIRE_MONSTER_TYPE, new HealAbility("Flame Heal", 0.5), new TypeAbility("Heat Beam", 20), sa);
	}
	
	public FireMonster(String name, int health, int monsterType, HealAbility ha, TypeAbility ta, SignatureAbility sa) {
		super(name, health, Monster.FIRE_MONSTER_TYPE, ha, ta, sa);
	}

}
