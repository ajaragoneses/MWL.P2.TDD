package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class klondikeInitTest {
	
	@BeforeClass
	public void init(){
		Deck deck = new Deck();
	}

	@Test
	public void DeckSizeTest() {
		assertEquals(24, deck.size());
	}
	
	

}
