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
	
	@Before
	public void init(){
		waste = new Waste();
		deck = new Deck();
		for(int i = 0; i < 18; i++){
			deck.moveToWaste(waste);
		}
	}
	
	
	@Test
	public void WasteNotEmptyTest() {
		assertTrue(waste.isWasteGetCardPermited());
	}
	
	@Test
	public void MoveToDeckIsPermitedTest() {
		assertTrue(deck.size() == 0);
	}
	
	@Test
	public void WasteSizeAfterMoveTest(){
		waste.moveToDeck(deck);
		assertTrue(waste.size() == 0);
	}

	@Test
	public void DeckSizeAfterMoveTest(){
		waste.moveToDeck(deck);
		assertTrue(deck.size() == 52);
	}
	
}
