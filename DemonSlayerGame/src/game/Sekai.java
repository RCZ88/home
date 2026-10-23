package game;

import java.util.ArrayList;

public class Sekai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Hashira> Hashira = new ArrayList<>();
		
		ArrayList<Ability> tanjiroAbilities = new ArrayList<Ability>();
		Ability tanjiroBasic = new Ability(1.2, "basic");
		Ability tanjiroSkill = new Ability(2.5, "skill");
		Ability tanjiroUltimate = new Ability(4.2, 2.8, "ultimate");
		Ability tanjiroDefend = new Ability (0, 4, "defend");
		
		tanjiroAbilities.add(tanjiroBasic);
		tanjiroAbilities.add(tanjiroSkill);
		tanjiroAbilities.add(tanjiroUltimate);
		tanjiroAbilities.add(tanjiroDefend);
		
		Hashira TANJIRO = new Hashira ("Tanjiro", 400, 4200, 20, tanjiroAbilities);
		Hashira.add(TANJIRO);
		
		ArrayList<Ability>zenitsuAbilities = new ArrayList<Ability>();
		Ability zenitsuBasic = new Ability(2.5, "basic");
		Ability zenitsuSkill = new Ability(3.5, "skill");
		Ability zenitsuUltimate = new Ability(4.2, 2.8, "ultimate");
		Ability zenitsuDefend = new Ability (0, 4, "defend");
		
		
	}

}
