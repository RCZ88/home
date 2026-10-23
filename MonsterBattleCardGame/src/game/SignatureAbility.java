package game;

public class SignatureAbility extends Ability{
	
	public SignatureAbility(String name, int damage, int aoeSize) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public SignatureAbility(String name, int heal) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public SignatureAbility(String name, int heal, int damage, int aoeSize) {
		super(name);
	}

	@Override
	public void use(Monster from, Monster to) {
		// TODO Auto-generated method stub
		if(heal != 0 && damage == 0) {
			heal(monster, heal);
			monster.match.addLog(new Turn(Turn.turnCount+1, name, from, to, heal, true));
		}else if(damage != 0 && heal == 0) {
			attack(monster);
			monster.match.addLog(new Turn(Turn.turnCount+1, name, from, to, damage, false));
		}else if(heal != 0 && damage != 0) {
			heal(monster, heal);
			attack(monster);
			
		}
	}

}
