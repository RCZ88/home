package inhertancePractice;

import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();
        Characther player = new Characther(playerName, 5, 20.0f);

        System.out.print("Enter enemy name: ");
        String enemyName = scanner.nextLine();
        Characther enemy = new Characther(enemyName, 6, 15.0f);

        // Create and add items
        Weapon sword = new Weapon("Iron Sword", 2.5f, 50, 1, 10, 2, 15);
        Armor shield = new Armor("Wooden Shield", 1.5f, 20, 1, 5, "physical");
        Potion healthPotion = new Potion("Minor Health Potion", 0.5f, 15, 1, 20, "heal");

        player.addItem(sword);
        player.addItem(shield);
        player.addItem(healthPotion);

        // Equip items
        player.equipItem(sword, 0);
        player.equipItem(shield, 1);
        
        enemy.equipItem(sword, 0);
        enemy.equipItem(shield, 1);
        
        int round = 0;
        // Battle loop
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
        	round++;
        	player.setDefense(0);
        	player.findWeapon();
        	
            System.out.println("\n**Round"+ round + " Start**");
            System.out.println(player.toString());
            System.out.println(enemy.toString());

            // Player turn
            System.out.println("\n" + player.getName() + "'s turn:");
            System.out.println("1. Attack with " + player.getWeapon());
            System.out.println("2. Use potion from inventory");
            System.out.println("3. Use Armor to Protect from next Attack");
            System.out.print("Choose an action (1 or 2): ");
            int action = scanner.nextInt();

            if (action == 1) {
                player.useItem(0, enemy); // Assuming slot 0 for the weapon
            } else if (action == 2) {
                player.useItem(healthPotion.getName()); // Use potion by name
            } else if(action == 3) {
            	player.useItem(shield.getName());
            	
            }
            else {
                System.out.println("Invalid action!");
            }

            // Enemy turn (basic attack)
            System.out.println("\n" + enemy.getName() + "'s turn:");
            enemy.useItem(0, player); // Simulate basic attack (modify for different enemy logic)

            // Check for end of battle
            if (player.getHealth() <= 0) {
                System.out.println("\n" + enemy.getName() + " wins!");
            } else if (enemy.getHealth() <= 0) {
                System.out.println("\n" + player.getName() + " wins!");
            }
        }

        scanner.close(); 
	}

}
