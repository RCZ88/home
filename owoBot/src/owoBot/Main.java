package owoBot;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bot owoBot = new Bot();
		boolean play = true;
		while(play) {
			String command = sc.nextLine();
			if(command.equals("owo hunt") || command.equals("owo h")) {
				owoBot.hunt(12);
			}else if(command.equals("owo zoo")) {
				owoBot.zoo();
			}else if(command.equals("owo cowoncy")) {
				owoBot.cowoncy();
			}else if(command.equals("owo exit")) {
				play = false;
				sc.close();
			}else if(command.contains("owo sell")) {
				if(command.equals("owo sell all")) {
					owoBot.sellAll();
				}else {
					String [] parts = command.split(" ");
					
					String animalName = parts[2];
					int amount = Integer.parseInt(parts[3]);
					
					owoBot.sell(animalName, amount);
				}
			}
			else {
				System.out.println("Invalid Command");
			}
		}
	}

}
