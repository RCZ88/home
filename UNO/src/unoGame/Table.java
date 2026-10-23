package unoGame;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
	protected ArrayList<Card> cards;
	protected ArrayList<Card> placedCards;
	private Player[]players;
	
	public Table(int nop) {
		cards = new ArrayList<>();
		placedCards = new ArrayList<>();
		players = new Player[nop];
		initializeCards();
		placedCards.add(firstCard());
	}
	
	private void initializeCards() {
		String [] colors = {"green", "red", "blue", "yellow"};
		String [] specialColor = {"skip","reverse","+2"};
		String [] specialCard = {"+4", "pickcolor"};
		
		for(int i = 0 ; i<4; i++) {
			cards.add(new NumberCard(0, colors[i]));
			for(int k = 0; k<2; k++) {
				for(int j = 1; j<=9; j++) {
					cards.add(new NumberCard(j, colors[i]));
				}
				for(int j = 0; j<3; j++) {
					cards.add(new SpecialColor(colors[i], specialColor[j]));
				}
			}
			for(int k = 0; k<2; k++) {
				cards.add(new SpecialCard(specialCard[k]));
			}
		}
		for(int i = 0 ; i<10; i++) {
			Collections.shuffle(cards);
		}
	}
	public void distributeCards() {
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<players.length; j++) {
				Card c = cards.get(cards.size()-1);
				players[j].recieve(c);
				cards.remove(c);
			}
		}
	}
	private Card firstCard() {
		boolean cardFound = false;
		int index = 0;
		while(!cardFound) {
			Card card = cards.get(index++);
			if(card instanceof NumberCard) {
				cardFound = true;
				return card;
			}
		}
		return null;
	}
}
