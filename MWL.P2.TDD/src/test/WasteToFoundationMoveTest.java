package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class WasteToFoundationMoveTest {

	public Waste waste;
	public Deck deck;
	public Foundations foundations;
	
	@Before
	public void init(){
		waste = new Waste();
		deck = new Deck();
		foundations = new Foundations();
		
		Card card_1 = new Card(Color.ROJO, Palo.ROMBOS, Valor.Q);
		Card card_2 = new Card(Color.NEGRO, Palo.PICAS, Valor.3);
		Card card_3 = new Card(Color.ROJO, Palo.CORAZONES, Valor.7);
		Card card_4 = new Card(Color.NEGRO, Palo.PICAS, Valor.K);
		Card card_5 = new Card(Color.ROJO, Palo.ROMBOS, Valor.4);
		
		foundations.get(0).setTopCard(card_1);
		foundations.get(1).setTopCard(card_2);
		foundations.get(2).setTopCard(card_3);
		foundations.get(3).setTopCard(card_4);
		waste.setTopCard(card_5);
	}
	
	@Test
	public void WasteNotEmptyTest() {
		assertTrue(waste.isWasteGetCardPermited());
	}
	
	@Test
	public void MoveToFoundationPermited(){
		Foundation foundation = foundations.get(0);
		assertFalse(foundation.isMoveToFoundationPermited(waste.getTopCard()));
		foundation = foundations.get(1);
		assertTrue(foundation.isMoveToFoundationPermited(waste.getTopCard()));
		foundation = foundations.get(2);
		assertFalse(foundation.isMoveToFoundationPermited(waste.getTopCard()));
		foundation = foundations.get(3);
		assertFalse(foundation.isMoveToFoundationPermited(waste.getTopCard()));
	}

	@Test
	public void WasteSizeAfterMoveTest(){
		waste.moveTopToFoundation(foundations.get(1));
		assertEquals(0, waste.size());
	}
	
	
	
	
}
