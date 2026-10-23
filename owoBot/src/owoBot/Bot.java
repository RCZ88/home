package owoBot;

import java.util.ArrayList;
import java.util.Random;

public class Bot {
	Random r = new Random();
	
	private Zoo zoo;
	private static final double COMMONPERCENTAGE = 58.6;
	private static final double UNCOMMONPERCENTAGE = 30;
	private static final double RAREPERCENTAGE = 10;
	private static final double EPICPERCENTAGE = 1;
	private static final double LEGENDARYPERCENTAGE = 0.1;
	private static final double MYTHICALPERCENTAGE = 0.01;
	protected static double GEMPERCENTAGE = 0.005;
	private static final double SECRETPERCENTAGE = 0.0001;
	private static final int MAXRARITY = 100000;
	protected static int huntAmount;
	protected static Gem [] usedGems = new Gem[3];

	private int cowoncy;
	
	Bot(){
		 zoo = new Zoo();
		 cowoncy = 1000;
	}
	
	public void hunt(int amnt) {
	    System.out.println("Animal Caught: ");
	    if(cowoncy >= amnt*5) {
	    	for (int i = 0; i < amnt; i++) {
		        String rarity = getRarity();
		        Animal animal = getAnimal(rarity);
		        zoo.addAnimal(animal);
		        if(i != amnt-1) {
		        	System.out.print(animal.getName()+"("+animal.getRarity().charAt(0)+")  ");
		        }else {
		        	System.out.print(animal.getName()+"("+animal.getRarity().charAt(0)+")  \n");
		        }
		        cowoncy -= 5;
		        
		    }
	    }
	    
	}
	public void zoo() {
		zoo.printZoo();
	}
	private String getRarity() {
	    int rn = r.nextInt(MAXRARITY) + 1;
	    double cp = COMMONPERCENTAGE;
	    double up = cp + UNCOMMONPERCENTAGE;
	    double rp = up + RAREPERCENTAGE;
	    double ep = rp + EPICPERCENTAGE;
	    double lp = ep + LEGENDARYPERCENTAGE;
	    double mp = lp + MYTHICALPERCENTAGE;
	    double gp = mp + GEMPERCENTAGE;
	    double sp = gp + SECRETPERCENTAGE;

	    if (rn <= (cp / 100) * MAXRARITY) {
	        return "Common";
	    } else if (rn <= (up / 100) * MAXRARITY) {
	        return "Uncommon";
	    } else if (rn <= (rp / 100) * MAXRARITY) {
	        return "Rare";
	    } else if (rn <= (ep / 100) * MAXRARITY) {
	        return "Epic";
	    } else if (rn <= (lp / 100) * MAXRARITY) {
	        return "Legendary";
	    } else if (rn <= (mp / 100) * MAXRARITY) {
	        return "Mythical";
	    } else if (rn <= (sp / 100) * MAXRARITY) {
	    	return "Secret";
	    }
	    else {
	        // Default to Common if no other rarity is matched
	        return "Common";
	    }
	}
	private Animal getAnimal(String rarity) {
		TheWild wild = new TheWild();
		ArrayList <Animal> animals = wild.animals;
		Animal [] rarityAnimals = new Animal [5];
		int index = 0;
		for(Animal animal:animals) {
			if(animal.getRarity().equalsIgnoreCase(rarity)) {
				if(index < 5) {
					rarityAnimals[index] = animal;
					index++;
				}else {
					break;
				}
			}
		}
		int randomAnimal = r.nextInt(index);
		return rarityAnimals[randomAnimal];
	}
	
	public int getCowoncy() {
		return cowoncy;
	}
	
	public void cowoncy() {
		System.out.println(cowoncy);
	}
	
	public void sell(String animalName, int amount) {
		int moneyEarned = 0;
		boolean animalFound = false;
		for(Animal a: zoo.zoo) {
			if(a.getName().equalsIgnoreCase(animalName)) {
				animalFound = true;
				if(a.amount >= amount) {
					a.amount -= amount;
					moneyEarned+= sellValue(a);
					cowoncy+=moneyEarned;
					System.out.println("Animal sold Successfully for " + moneyEarned + " Cowoncy!");
				}else {
					System.out.println("Issuficient amount!");
				}
				break;
			}
		}
		if(!animalFound) {
			System.out.println("Animal Not Found!");
		}
	}
	public void sellAll() {
		int moneyEarned = 0;
		boolean animalAvailable = false;
		for(Animal a: zoo.zoo) {
			if(a.amount > 0 ) {
				if(!animalAvailable) {
					animalAvailable = true;
				}
				moneyEarned += sellValue(a) * a.amount;
				a.amount = 0;
			}
		}
		if(!animalAvailable) {
			System.out.println("Not enough Animal to sell!");
		}else {
			cowoncy+=moneyEarned;
			System.out.println("All Animal Sold Successfully for: "+ moneyEarned + " Cowoncy");
		}
		
	}
	private int sellValue(Animal animal) {
		String rarity = animal.getRarity();
		switch(rarity) {
        case "Common":
        	return 1;
        case "Uncommon":
        	return 5;
        case "Rare":
        	return 20;
        case "Epic": 
        	return 250;
        case "Legendary":
        	return 3000;
        case "Mythical":
        	return 10000;
        case "Secret":
        	return 100000;
        }
		return -1;
	}
}
