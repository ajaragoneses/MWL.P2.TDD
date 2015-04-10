package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Klondike.Card;
import Klondike.Color;
import Klondike.Deck;
import Klondike.Foundations;
import Klondike.Palo;
import Klondike.Valor;
import Klondike.Waste;

public class WasteToDeckMoveTest {

	public Waste waste;
	public Deck deck;
	public Foundations foundations;
	
	@Before
	public void init(){
		waste = new Waste();
		deck = new Deck();
		
		Card card_1 = new Card(Color.ROJO, Palo.ROMBOS, Valor.Q);
		Card card_2 = new Card(Color.NEGRO, Palo.PICAS, Valor.TRES);
		Card card_3 = new Card(Color.ROJO, Palo.CORAZONES, Valor.SIETE);
		Card card_4 = new Card(Color.NEGRO, Palo.PICAS, Valor.K);
		Card card_5 = new Card(Color.ROJO, Palo.ROMBOS, Valor.CUATRO);
		
		waste.addCardOnTop(card_5);
		waste.addCardOnTop(card_4);
		waste.addCardOnTop(card_3);
		waste.addCardOnTop(card_2);
		waste.addCardOnTop(card_1);
	}
	
	
	@Test
	public void WasteNotEmptyTest() {
		assertTrue(waste.isWasteGetCardPermited());
	}
	
	@Test
	public void MoveToDeckIsPermitedTest() {
		assertTrue(deck.size() == 0);
	}

}
