package Klondike;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> internalDeck;
	static final int MAXIMUM_CARDS_MOVE_TO_WASTE = 3;
	
	public Deck(){
		internalDeck = new ArrayList<Card>();
		for(int i = 0; i < Valor.values().length-1; i++){
			internalDeck.add(new Card(Color.ROJO, Palo.CORAZONES, Valor.values()[i]));
			internalDeck.add(new Card(Color.NEGRO, Palo.TREBOLES, Valor.values()[i]));
			internalDeck.add(new Card(Color.ROJO, Palo.ROMBOS, Valor.values()[i]));
			internalDeck.add(new Card(Color.NEGRO, Palo.PICAS, Valor.values()[i]));
		}
		Collections.shuffle(internalDeck);
	}
	
	public int size() {
		return internalDeck.size();
	}

	public void addCardOnTop(Card card) {
		internalDeck.add(0, card);
	}

	public void moveToWaste(Waste waste) {
		for(int i = 0; i < MAXIMUM_CARDS_MOVE_TO_WASTE; i++){
			if(internalDeck.size() <= 0) break;
			waste.addCardOnTop(internalDeck.remove(0));
		}
	}

	public void initTableaus(Tableaus tableaus) {
		for(int i = 0; i < tableaus.getTableaus().length; i++){
			for(int j = 0; j <= i; j++){
				tableaus.getTableau(i).addCardOnTop(internalDeck.remove(0));
			}
			tableaus.getTableau(i).getCard(0).setDiscovered(true);
		}
	}

	public void shuffle() {
		Collections.shuffle(internalDeck);
	}

}
