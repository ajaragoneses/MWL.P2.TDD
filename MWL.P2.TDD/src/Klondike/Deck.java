package Klondike;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	List<Card> internalDeck;
	
	public Deck(){
		internalDeck = new ArrayList<Card>();
	}
	
	public int size() {
		return internalDeck.size();
	}

	public void addCardOnTop(Card card) {
		// TODO Auto-generated method stub
	}

	public void moveToWaste(Waste waste) {
		// TODO Auto-generated method stub
	}

}
