package game;

public class IceMonster extends Monster{

	public IceMonster(String name, int health, SignatureAbility sa) {
		super(name, health, Monster.ICE_MONSTER_TYPE, new HealAbility("Cold Heal", 0.8), new TypeAbility("Razor Freeze", 15), sa);
	}
	public IceMonster(String name, int health, int monsterType, HealAbility ha, TypeAbility ta, SignatureAbility sa) {
		super(name, health, Monster.ICE_MONSTER_TYPE, ha, ta, sa);
	}

}
