package owoBot;
import java.util.ArrayList;

public class Zoo {
    private int zooPoints;
    protected ArrayList<Animal> zoo;
    private TheWild wild = new TheWild();
    private static final int COMMONVALUE = 1;
    private static final int UNCOMMONVALUE = 5;
    private static final int RAREVALUE = 20;
    private static final int EPICVALUE = 250;
    private static final int LEGENDARYVALUE = 3000;
    private static final int MYTHICALVALUE = 10000;
    private static final int SECRETVALUE = 100000;
    
    public Zoo() {
    	zoo = wild.animals;
    }
    
    public void addAnimal(Animal animal) {
        // Add the animal to the zoo and update its count
    	String rarity = animal.getRarity();
    	for(Animal a: zoo) {
    		if(a.getName().equals(animal.getName())) {
    			if(a.amount == 0 && a.discovered == false) {
    				a.discovered = true;
    			}
    			a.amount++;
    			break;
    		}
    	}
        switch(rarity) {
        case "Common":
        	zooPoints+= COMMONVALUE;
        	break;
        case "Uncommon":
        	zooPoints+= UNCOMMONVALUE;
        	break;
        case "Rare":
        	zooPoints+= RAREVALUE;
        	break;
        case "Epic": 
        	zooPoints+= EPICVALUE;
        	break;
        case "Legendary":
        	zooPoints+= LEGENDARYVALUE;
        	break;
        case "Mythical":
        	zooPoints+= MYTHICALVALUE;
        	break;
        case "Secret":
        	zooPoints+= SECRETVALUE;
        	break;
        }

    }
    public void printZoo() {
        System.out.println("Animals in the Zoo:");
        for(int i = 0; i<Animal.RARITIES.length; i++) {
        	printRarity(Animal.RARITIES[i]);
        }
        System.out.println("Zoo Points: "+ zooPoints);
    }
    
    public void printRarity(String rarity) {
    	System.out.println("\n"+ rarity+": \n" );
    	for(Animal animal:zoo){
    		if(animal.getRarity().equalsIgnoreCase(rarity)) {
    			if(animal.discovered == true) {
    				System.out.println(animal.getName() + "(" + animal.amount + ")");
    			}
    		}
    	}
    }
}
