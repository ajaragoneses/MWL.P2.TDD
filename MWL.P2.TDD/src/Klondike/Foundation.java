package Klondike;

import java.util.ArrayList;

public class Foundation {

	private ArrayList<Card> internalFoundation;
	
	public Foundation(){
		internalFoundation = new ArrayList<Card>();
	}
	
	public boolean isMoveToFoundationPermited(Card card) {
		if(!card.isDiscovered()) return false;
		if(card.equalPalo(internalFoundation.get(0))) return false;
		if(internalFoundation.get(0).getValor().compareTo(card.getValor()) >= 0) return false;
		return true;
	}

	public int size() {
		return internalFoundation.size();
	}

	public void addTopCard(Card card) {
		internalFoundation.add(0, card);
	}

}
