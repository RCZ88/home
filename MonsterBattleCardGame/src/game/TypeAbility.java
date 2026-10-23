package game;

public class TypeAbility extends Ability{
	
	public TypeAbility(String name, int damage, int aoe) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public TypeAbility(String name, int heal) {
		super(name);
	}

	@Override
	public void use(Monster from, Monster to) {
		// TODO Auto-generated method stub
		if(damage != 0 && aoe != 0) {
			attack(monster);
			monster.match.addLog(new Turn(Turn.turnCount+1, name, from, to, damage, false));
		}else {
			heal(monster, heal);
			monster.match.addLog(new Turn(Turn.turnCount+1, name, from, to, heal, true));
		}
	}

}
