package byOOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		Canteen TunasMuda = new Canteen();
		
		//Creates Item
		Item item1 = new Item("Gyudon Garlic Butter", 35000, 7);
		Item item2 = new Item("Currie Udon", 37500, 5);
		Item item3 = new Item("Aqua Water", 5000, 20);
		Item item4 = new Item("Kebab Ayam", 25000, 10);
		Item item5 = new Item("Karage", 30000, 20);
		Item item6 = new Item("Susu Coklat Milo", 7000, 15);
		
		//Adds Item to the Store
		TunasMuda.addItem(item1);
		TunasMuda.addItem(item2);
		TunasMuda.addItem(item3);
		TunasMuda.addItem(item4);
		TunasMuda.addItem(item5);
		TunasMuda.addItem(item6);
		
		//Make new Student ID cards
		IDCard card1 = new IDCard("Howard Soputan", "Student", TunasMuda);
		IDCard card2 = new IDCard("Jennifer Tan", "Student", TunasMuda);
		IDCard card3 = new IDCard("Michael Lee", "Student", TunasMuda);
		IDCard card4 = new IDCard("Sarah Wong", "Teacher", TunasMuda);
		IDCard card5 = new IDCard("Kevin Chen", "Teacher", TunasMuda);
		
		//Showing Details (ID, Name, Role, etc)
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		System.out.println(card4.toString());
		System.out.println(card5.toString());
		
		//Register the Cards
		TunasMuda.registerID(card2);
		TunasMuda.registerID(card3);
		TunasMuda.registerID(card4);
		TunasMuda.registerID(card5);
		
		//TopUp Student ID's
		card2.topUp(800000);
		card3.topUp(50000);
		card5.topUp(120000);
		
		//Display Canteen
		System.out.println("\n");
		TunasMuda.displayItems();
		
		
		System.out.println("---Using Card2---");
		//Buying Items
		card2.scan();
		card2.buy(item6, 2);
		card2.buy(item2, 5);
		card2.buy(item3, 3);
		card2.viewCart();
		card2.done();
		card2.checkBalance();
		
		//Display Canteen
		System.out.println("\n");
		TunasMuda.displayItems();
		
		System.out.println("---Using Card3---");
		//Buying 
		card3.buy(item1, 3);
		card3.scan();
		card3.buy(item1, 3);
		card3.buy(item2, 1);
		card3.buy(item4, 2);
		card3.viewCart();
		card3.done();
		card3.checkBalance();
		
		//Display Canteen
		System.out.println("\n");
		TunasMuda.displayItems();
		
		System.out.println("---Using Card1---");
		card1.scan();
		long stopTime = System.nanoTime();
		long time = stopTime-startTime;
		System.out.println("Time: " + time + " Nano Seconds");
	}

}
