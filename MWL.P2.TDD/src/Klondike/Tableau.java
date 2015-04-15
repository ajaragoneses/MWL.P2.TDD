package Klondike;

import java.util.ArrayList;

public class Tableau {

	private ArrayList<Card> internalTableau;
	
	public Tableau(){
		internalTableau = new ArrayList<Card>();
	}
	
	public int size() {
		return internalTableau.size();
	}

	public Card getCard(int i) {
		if(internalTableau.size() <= 0) return null;
		return internalTableau.get(i);
	}

	public Card getTopCard() {
		if(internalTableau.size() <= 0) return null;
		return internalTableau.remove(0);
	}
	
	public void addCardOnTop(Card card) {
		internalTableau.add(0, card);
	}

}
