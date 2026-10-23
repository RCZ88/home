package owoBot;

import java.util.ArrayList;

public class Gems {
	protected static ArrayList <Gem> gems = new ArrayList<Gem>();
	Gems(){
		gems.add(new Gem("Diamond Gem", "Common", 25));
		gems.add(new Gem("Diamond Gem", "Uncommon", 25));
		gems.add(new Gem("Diamond Gem", "Rare", 50));
		gems.add(new Gem("Diamond Gem", "Epic", 75));
		gems.add(new Gem("Diamond Gem", "Legendary", 75));
		gems.add(new Gem("Diamond Gem", "Mythical", 100));
		
		gems.add(new Gem("Heart Gem", "Common", 50));
		gems.add(new Gem("Heart Gem", "Uncommon", 100));
		gems.add(new Gem("Heart Gem", "Rare", 250));
		gems.add(new Gem("Heart Gem", "Epic", 450));
		gems.add(new Gem("Heart Gem", "Legendary", 525));
		gems.add(new Gem("Heart Gem", "Mythical", 800));
		
		gems.add(new Gem("Round Gem", "Common", 50));
		gems.add(new Gem("Round Gem", "Uncommon", 100));
		gems.add(new Gem("Round Gem", "Rare", 250));
		gems.add(new Gem("Round Gem", "Epic", 450));
		gems.add(new Gem("Round Gem", "Legendary", 525));
		gems.add(new Gem("Round Gem", "Mythical", 800));

	}
	
}
