package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Klondike.Card;
import Klondike.Color;
import Klondike.Foundation;
import Klondike.Foundations;
import Klondike.Palo;
import Klondike.Valor;
import Klondike.Waste;

public class WasteToFoundationMoveTest {

	public Waste waste;
	public Foundations foundations;
	
	@Before
	public void init(){
		waste = new Waste();
		foundations = new Foundations();
		
		Card card_1 = new Card(Color.ROJO, Palo.ROMBOS, Valor.TRES);
		card_1.setDiscovered(true);
		Card card_2 = new Card(Color.NEGRO, Palo.PICAS, Valor.TRES);
		card_2.setDiscovered(true);
		Card card_3 = new Card(Color.ROJO, Palo.CORAZONES, Valor.SIETE);
		card_3.setDiscovered(true);
		Card card_4 = new Card(Color.NEGRO, Palo.PICAS, Valor.K);
		card_4.setDiscovered(true);
		Card card_5 = new Card(Color.ROJO, Palo.ROMBOS, Valor.CUATRO);
		card_5.setDiscovered(true);
		
		foundations.get(0).addTopCard(card_1);
		foundations.get(1).addTopCard(card_2);
		foundations.get(2).addTopCard(card_3);
		foundations.get(3).addTopCard(card_4);
		waste.addCardOnTop(card_5);
	}
	
	@Test
	public void WasteNotEmptyTest() {
		assertTrue(waste.isWasteGetCardPermited());
	}
	
	@Test
	public void MoveToFoundationPermitedTest(){
		Foundation foundation = foundations.get(0);
		assertTrue(foundation.isMoveToFoundationPermited(waste.getTopCard()));
		foundation = foundations.get(1);
		assertFalse(foundation.isMoveToFoundationPermited(waste.getTopCard()));
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
	
	
	@Test
	public void FoundationSizeAfterMoveTest(){
		waste.moveTopToFoundation(foundations.get(1));
		assertEquals(2, foundations.get(1).size());
	}
	
}
