package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class WasteToFoundationMoveTest {

	public Waste waste;
	
	@BeforeClass
	public void init(){
		Waste waste = new Waste();
		Deck deck = new Deck();
	}
	
	@Test
	public void WasteNotEmptyTest() {
		deck.moveToWaste();
		assertTrue(waste.isWasteToFoundationPermited());
	}

}
