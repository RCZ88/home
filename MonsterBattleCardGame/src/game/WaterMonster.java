package game;

public class WaterMonster extends Monster{

	public WaterMonster(String name, int health, int monsterType, SignatureAbility sa) {
		super(name, health, Monster.WATER_MONSTER_TYPE, new HealAbility("Liquid Heal", 1), new TypeAbility("Water Blast", 12), sa);
	}
	public WaterMonster(String name, int health, int monsterType, HealAbility ha, TypeAbility ta, SignatureAbility sa) {
		super(name, health, Monster.WATER_MONSTER_TYPE, ha, ta, sa);
	}
	
}
