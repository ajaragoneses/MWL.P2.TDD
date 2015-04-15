package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Klondike.Deck;
import Klondike.Waste;

public class DeckToWasteMoveTest {

	public Waste waste;
	public Deck deck;
	
	@Before
	public void init(){
		waste = new Waste();
		deck = new Deck();
	}
	
	
	@Test
	public void DeckNotEmptyTest() {
		assertTrue(deck.size() > 0);
	}
	
	@Test
	public void WasteSizeAfterMoveTest(){
		deck.moveToWaste(waste);
		assertTrue(waste.size() == 3);
	}

	@Test
	public void DeckSizeAfterMoveTest(){
		deck.moveToWaste(waste);
		assertTrue(deck.size() == 49);
	}

}
