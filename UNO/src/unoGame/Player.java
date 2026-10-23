package unoGame;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> cards;
	private Table table;
	
	public Player(Table t) {
		cards = new ArrayList<>();
		table = t;
	}
	
	public void put(Card card) {
		boolean valid = false;
		ArrayList<Card>tc = table.cards;
		Card lc = tc.get(tc.size()-1);
		if(!(card instanceof SpecialCard)) {
			if(card instanceof NumberCard) {
				NumberCard nc = (NumberCard) card;
				if(lc instanceof NumberCard) {
					if(nc.getNumber() == ((NumberCard)tc.get(tc.size()-1)).getNumber() || nc.getColor() == ((NumberCard)tc.get(tc.size()-1)).getColor()) {
						valid = true;
					}
				}
			}else if(card instanceof SpecialColor) {
				SpecialColor sc = (SpecialColor) card;
				if(lc instanceof SpecialColor) {
					if(((SpecialColor)lc).getAbility().equals("+2")) {
						if(sc.getAbility().equals("+2")) {
							valid = true;
						}
					}else if(((SpecialColor)lc).getAbility().equals("skip") || ((SpecialColor)lc).getAbility().equals("reverse")) {
						valid = true;
					}
				}else if(lc instanceof SpecialCard) {
					if(((SpecialCard)lc).getAbility().equals("+4")) {
						if(sc.getAbility().equals("+2")) {
							valid = true;
						}
					}
				}
			}
		}
		if(valid) {	
			table.placedCards.add(card);
			cards.remove(card);
		}else {
			System.out.println("Invalid Move!");
		}
	}
	public void recieve(Card card) {
		cards.add(card);
	}
	public void pull() {
		Card c = table.cards.get(table.cards.size()-1);
		cards.add(c);
		table.cards.remove(c);
	}
}
