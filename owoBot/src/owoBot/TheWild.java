package owoBot;

import java.util.ArrayList;

public class TheWild {
	protected ArrayList<Animal> animals = new ArrayList<>();
	TheWild(){
		// Adding 5 more common animals
		animals.add(new Animal("Cow", "Common"));
		animals.add(new Animal("Cat", "Common"));
		animals.add(new Animal("Dog", "Common"));
		animals.add(new Animal("Chicken", "Common"));
		animals.add(new Animal("Rabbit", "Common"));
		

		// Adding 5 more uncommon animals
		animals.add(new Animal("Dolphin", "Uncommon"));
		animals.add(new Animal("Ostrich", "Uncommon"));
		animals.add(new Animal("Kangaroo", "Uncommon"));
		animals.add(new Animal("Lynx", "Uncommon"));
		animals.add(new Animal("Penguin", "Uncommon"));

		// Adding 5 more rare animals
		animals.add(new Animal("Elephant", "Rare"));
		animals.add(new Animal("Giraffe", "Rare"));
		animals.add(new Animal("Panda", "Rare"));
		animals.add(new Animal("Tiger", "Rare"));
		animals.add(new Animal("Zebra", "Rare"));

		// Adding 5 more epic animals
		animals.add(new Animal("Dragon", "Epic"));
		animals.add(new Animal("Phoenix", "Epic"));
		animals.add(new Animal("Yeti", "Epic"));
		animals.add(new Animal("Kraken", "Epic"));
		animals.add(new Animal("Chimera", "Epic"));

		// Adding 5 more legendary animals
		animals.add(new Animal("Unicorn", "Legendary"));
		animals.add(new Animal("Griffin", "Legendary"));
		animals.add(new Animal("Sphinx", "Legendary"));
		animals.add(new Animal("Phoenix", "Legendary"));
		animals.add(new Animal("Dragon", "Legendary"));
		
		// Adding 5 more mythical animals
		animals.add(new Animal("Centaur", "Mythical"));
		animals.add(new Animal("Chimera", "Mythical"));
		animals.add(new Animal("Pegasus", "Mythical"));
		animals.add(new Animal("Minotaur", "Mythical"));
		animals.add(new Animal("Cerberus", "Mythical"));

		// Adding 5 more secret animals
		animals.add(new Animal("Mothman", "Secret"));
		animals.add(new Animal("Chupacabra", "Secret"));
		animals.add(new Animal("Jersey Devil", "Secret"));
		animals.add(new Animal("Bigfoot", "Secret"));
		animals.add(new Animal("Loch Ness Monster", "Secret"));
	}
}
