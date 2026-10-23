package game;

import java.util.ArrayList;

public class Demon extends Character{
	
	private String name = super.name;
	private double strength = super.strength;
	private double hp = super.hp;
	private double defense = super.defense;
	private double healPercentage;
	private boolean defendMod;
	
	private Ability basic;
	private Ability skill;
	private Ability ultimate;
	private Ability defend;
	private Ability heal;
	
	Demon(String name, int strength, int hp, int defense, ArrayList<Ability>Abilities) {
		super(name, (int)(strength * 3.6), (int)(hp *1.3), (int) (defense*1.7), Abilities);
		for(Ability ability: Abilities) {
			if(ability.getType().equalsIgnoreCase("basic")) {
				basic = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "basic");
			}else if(ability.getType().equalsIgnoreCase("skill")) {
				skill = new Ability(ability.getDmgMulti(), ability.getDefMulti(), ability.getHealPercentage(), "skill");
			}else if(ability.getType().equalsIgnoreCase("ultimate")){
				ultimate = new Ability(ability.getDmgMulti(), ability.getDefMulti(), ability.getHealPercentage(), "ultimate");
			}else if(ability.getType().equalsIgnoreCase("defense")) {
				defend = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "defense");
			}else if(ability.getType().equalsIgnoreCase("heal")) {
				heal = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "heal");
			}
		}
		healPercentage = 8;
		
	}

	@Override
	public void basic(Character character) {
		// TODO Auto-generated method stub
		character.setHp(character.hp - ((100 - character.defense)/100) * (basic.getDmgMulti()*this.strength));
		hp += ((basic.getHealPercentage()/100 * healPercentage) * hp);
	}

	@Override
	public void ability(Character character) {
		// TODO Auto-generated method stub
		character.setHp(character.hp - ((100 - character.defense)/100) * (skill.getDmgMulti()*this.strength));
	}

	@Override
	public void ultimate(Character character) {
		// TODO Auto-generated method stub
		character.setHp(character.hp - ((100 - character.defense)/100) * (ultimate.getDmgMulti()*this.strength));
		hp += ((ultimate.getHealPercentage()/100 * healPercentage) * hp);
	}

	public void heal() {
		hp += ((heal.getHealPercentage()/100 * healPercentage) * hp);
	}

	@Override
	public void setStrength(double strength) {
		// TODO Auto-generated method stub
		this.strength = strength;
	}

	@Override
	public void setHp(double hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}

	@Override
	public void setDefense(double defense) {
		// TODO Auto-generated method stub
		this.defense = defense;
	}

	

}
