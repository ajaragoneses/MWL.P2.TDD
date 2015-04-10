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
		deck.moveToWaste();
	}
	
	@Test
	public void WasteNotEmptyTest() {
		assertTrue(waste.isWasteGetCardPermited());
	}

}
