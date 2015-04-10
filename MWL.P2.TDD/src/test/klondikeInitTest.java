package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class klondikeInitTest {
	
	public Deck deck;
	public Waste waste;
	public Foundations foundations;
	public Tableaus tableaus;
	
	@BeforeClass
	public void init(){
		deck = new Deck();
		waste = new Waste();
		foundations = new Foundations();
		tableaus = new Tableaus();
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
	public void NumberOfFoundationsTest(){
		assertEquals(4, foundations.size());
	}
	
	@Test
	public void NumberOfTableausTest(){
		assertEquals(4, tableaus.size());
	}
	

	@Test
	public void FoundationsSizeTest(){
		int[] foundationsSizes = foundations.getFoundationsSizes();
		for(int foundationSize : foundationsSizes){
			assertEquals(0, foundationSize);
		}
	}
	
	@Test
	public void TableausSizeTest(){
		int[] tableausSizes = tableaus.getTableausSizes();
		for(int i = 0; i < tableausSizes.length ; i++){
			assertEquals(i+1, tableausSizes[i]);
		}
	}
	
	@Test
	public void TableausFirstDiscoveredTest(){
		Tableau[] tableaus = tableaus.getTableaus();
		for(int i = 0; i < tableaus.length ; i++){
			assertTrue(tableaus.get(i).getTopCard().isDiscovered());
		}
	}
	
	@Test
	public void DeckNotRepeatedCardsTest(){
		Tableau[] tableaus = tableaus.getTableaus();
		for(int index = 0; index < tableaus.length ; index++){
			Tableau tableau = tableaus.get(index);
			for (int i = 0; i < tableau.size()-1; i++){
	            for (int j = i+1; j < tableau.size(); j++){
	                if( tableau.get(i).equals(tableau.get(j)) ){
	                	fail("Duplicate element");
	                }
	            }
	        }
	 	}
	}	
	
}
