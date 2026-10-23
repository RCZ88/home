package game;

public class HealAbility extends Ability{
	public int healAmount = 1;
	public double multiplier;

	public HealAbility(String name, double multiplier) {
		super(name);
		this.multiplier = multiplier;
	}

	@Override
	public void use(Monster from, Monster to) {
		// TODO Auto-generated method stub
		if(monster.health + healAmount <= monster.maxHealth) {
			monster.health += healAmount;
		}else {
			monster.health = monster.maxHealth;
		}
		monster.match.addLog(new Turn(Turn.turnCount+1, name, from, to, healAmount, true));
	}
	public void setHeal(int healAmt) {
		this.healAmount = (int) Math.ceil(healAmt*multiplier);
	}
	
}
