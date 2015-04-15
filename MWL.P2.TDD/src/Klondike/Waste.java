package Klondike;

import java.util.ArrayList;

public class Waste {

	private ArrayList<Card> internalWaste;
		
	public Waste(){
		internalWaste = new ArrayList<Card>();
	}	
	
	public boolean isWasteGetCardPermited() {
		return internalWaste.size() > 0;
	}

	public Card getTopCard() {
		return internalWaste.get(0);
	}

	public void moveTopToFoundation(Foundation foundation) {
		foundation.addTopCard(internalWaste.remove(0));
	}

	public int size(){
		return internalWaste.size();
	}

	public void addCardOnTop(Card card) {
		internalWaste.add(0, card);		
	}

	public void moveToDeck(Deck deck) {
		int fin = internalWaste.size();
		for(int i = 0; i < fin; i++){
			deck.addCardOnTop(internalWaste.remove(0));
		}
		deck.shuffle();
	}


}
