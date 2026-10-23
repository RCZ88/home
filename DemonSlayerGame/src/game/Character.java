package game;

import java.util.ArrayList;

public abstract class Character {
	protected String name;
	protected double strength;
	protected double hp;
	protected double defense;
	protected ArrayList <Ability> abilities;
	Character(String name, int strength, int hp, int defense, ArrayList<Ability> abilities){
		this.name = name;
		this.strength = strength;;
		this.hp = hp;
		this.defense = defense;
	}

	public abstract void basic(Character character);
	public abstract void ability(Character character);
	public abstract void ultimate(Character character);
	
	public abstract void setStrength(double strength);
	public abstract void setHp(double hp);
	public abstract void setDefense(double defense);

}
