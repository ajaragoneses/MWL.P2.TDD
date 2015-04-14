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

public class DeckToWasteMoveTest {

	public Waste waste;
	public Deck deck;
	
	@Before
	public void init(){
		waste = new Waste();
		deck = new Deck();
		
		Card card_1 = new Card(Color.ROJO, Palo.ROMBOS, Valor.Q);
		Card card_2 = new Card(Color.NEGRO, Palo.PICAS, Valor.TRES);
		Card card_3 = new Card(Color.ROJO, Palo.CORAZONES, Valor.SIETE);
		Card card_4 = new Card(Color.NEGRO, Palo.PICAS, Valor.K);
		Card card_5 = new Card(Color.ROJO, Palo.ROMBOS, Valor.CUATRO);
		
		deck.addCardOnTop(card_5);
		deck.addCardOnTop(card_4);
		deck.addCardOnTop(card_3);
		deck.addCardOnTop(card_2);
		deck.addCardOnTop(card_1);
	}
	
	
	@Test
	public void DeckNotEmptyTest() {
		assertTrue(waste.isDeckGetCardsPermited());
	}
	
	@Test
	public void WasteSizeAfterMoveTest(){
		waste.moveToDeck(deck);
		assertTrue(waste.size() == 3);
	}

	@Test
	public void DeckSizeAfterMoveTest(){
		waste.moveToDeck(deck);
		assertTrue(deck.size() == 2);
	}

}
