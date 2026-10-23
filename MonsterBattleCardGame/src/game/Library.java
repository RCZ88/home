package game;

import java.util.ArrayList;

public class Library {
	public final ArrayList<Monster>monsters = new ArrayList<>();
	public final ArrayList<Ability>abilities = new ArrayList<>();
	
	public ArrayList<Monster> getAllMonsterType(Class<? extends Monster> monsterType){
		ArrayList<Monster>m = new ArrayList<>();
		for(Monster monster : monsters) {
			if(monsterType.isInstance(monster)) {
				m.add(monster);
			}
		}
		return m;
	}
	
	public ArrayList<Ability>getAllAbilities(Class<? extends Ability> abilityType){
		ArrayList<Ability>a = new ArrayList<>();
		for(Ability ability : abilities) {
			if(abilityType.isInstance(ability)) {
				a.add(ability);
			}
		}
		return a;
	}
}
