package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Klondike.Deck;
import Klondike.Foundations;
import Klondike.Tableau;
import Klondike.Tableaus;
import Klondike.Waste;

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
		Tableau[] tableausArray = tableaus.getTableaus();
		for(int i = 0; i < tableausArray.length ; i++){
			assertTrue(tableausArray[i].getTopCard().isDiscovered());
		}
	}
	
	@Test
	public void DeckNotRepeatedCardsTest(){
		Tableau[] tableausArray = tableaus.getTableaus();
		for(int index = 0; index < tableausArray.length ; index++){
			Tableau tableau = tableausArray[index];
			for (int i = 0; i < tableau.size()-1; i++){
	            for (int j = i+1; j < tableau.size(); j++){
	                if( tableau.getCard(i).equals(tableau.getCard(j)) ){
	                	fail("Duplicate element");
	                }
	            }
	        }
	 	}
	}	
	
}
