package game;

public class Ability {
	private double dmgMulti;
	private double defMulti;
	private double healPercentage;
	private String attackType;
	private String type;
	
	
	Ability(double dmgMulti, String type){
		this.dmgMulti = dmgMulti;
		attackType = type;
		type = "Hashira";
	}
	Ability(double dmgMulti, double defMulti, String type){
		this.dmgMulti = dmgMulti;
		this.defMulti = defMulti;
		attackType = type;
		type = "Hashira";
	}
	Ability(double dmgMulti, double defMulti, double healPercentage, String type){
		this.dmgMulti = dmgMulti;
		this.defMulti = defMulti;
		this.healPercentage = healPercentage;
		attackType = type;
		type = "Demon";
	}
	
	private void setDmgMulti() {
		if(type.equalsIgnoreCase("Hashira")) {
			switch(attackType) {
			case "basic":
				dmgMulti = 2;
				break;
			case "skill":
				dmgMulti = 3.5;
				break;
			case "ultimate":
				dmgMulti = 6;
				defMulti = 3;
				break;
			case "defend": 
				defMulti = 4;
				break;
			}
		}else if(type.equalsIgnoreCase("Demon")) {
			switch(attackType) {
			case "basic":
				dmgMulti = 1.8;
				break;
			case "skill":
				dmgMulti = 3.5;
				healPercentage = 1.5;
				break;
			case "ultimate":
				dmgMulti = 5;
				defMulti = 3;
				healPercentage = 2;
				break;
			case "defend": 
				defMulti = 3;
				break;
			case "heal":
				healPercentage = 2.6;
			}
		}
		
	}
	public String getType() {
		return type;
	}
	public double getDefMulti() {
		return defMulti;
	}
	public double getDmgMulti() {
		return dmgMulti;
	}
	public double getHealPercentage() {
		return healPercentage;
	}
}
