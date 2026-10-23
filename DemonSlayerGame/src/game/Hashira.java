package game;

import java.util.ArrayList;

public class Hashira extends Character{	
	
	private String name = super.name;
	private double strength = super.strength;
	private double hp = super.hp;
	private double defense = super.defense;
	private boolean defendMod;
	
	private Ability basic;
	private Ability skill;
	private Ability ultimate;
	private Ability defend;
	
	Hashira(String name, int strength, int hp, int defense, ArrayList<Ability>Abilities) {
		super(name, (int)(strength * 4.2), (int)(hp *0.85), (int) (defense*2.2), Abilities);
		for(Ability ability: Abilities) {
			if(ability.getType().equalsIgnoreCase("basic")) {
				basic = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "basic");
			}else if(ability.getType().equalsIgnoreCase("skill")) {
				skill = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "skill");
			}else if(ability.getType().equalsIgnoreCase("ultimate")){
				ultimate = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "ultimate");
			}else if(ability.getType().equalsIgnoreCase("defense")) {
				defend = new Ability(ability.getDmgMulti(), ability.getDefMulti(), "defense");
			}
		}
	}

	@Override
	public void basic(Character character) {
		// TODO Auto-generated method stub
		character.setHp(character.hp - basic.getDmgMulti()*this.strength);
		if(defendMod) {
			this.defense -= defend.getDefMulti();
		}
	}

	@Override
	public void ability(Character character) {
		// TODO Auto-generated method stub
		character.setHp(character.hp - skill.getDmgMulti()*this.strength);
		if(defendMod) {
			this.defense -= defend.getDefMulti();
		}
	}

	@Override
	public void ultimate(Character character) {
		// TODO Auto-generated method stub
		character.setHp(character.hp - ultimate.getDmgMulti()*this.strength);
		if(defendMod) {
			this.defense -= defend.getDefMulti();
		}
		this.defense += defend.getDefMulti();
		defendMod = true;
	}
	
	public void defend() {
		// TODO Auto-generated method stub
		this.defense += defend.getDefMulti();
		defendMod = true;
		
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
