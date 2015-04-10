package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class klondikeInitTest {
	
	public Deck deck;
	public Waste waste;
	public Foundations foundations;
	
	@BeforeClass
	public void init(){
		deck = new Deck();
		waste = new Waste();
		foundations = new Foundations();
	}

	@Test
	public void DeckSizeTest(){
		assertEquals(24, deck.size());
	}
	
	@Test
	public void WasteSizeTest(){
		assertEquals(0, waste.size());
	}
	

	@Test
	public void FoundationsSizeTest(){
		int[] foundationsSizes = foundations.getFoundationsSize();
		for(int foundationSize : foundationsSizes){
			assertEquals(0, foundationSize);
		}
	}
}
