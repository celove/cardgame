package br.uff.qet.cardgame.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.uff.qet.cardgame.Card;
import br.uff.qet.cardgame.Rank;
import br.uff.qet.cardgame.Suit;

public class CardTest {

	Card carta;
	
	@Before
	public void create() {
		this.carta = new Card(Suit.CLUBS, Rank.ACE);
	}
	
	@Test
	public void testCard() {
		assertNotNull(this.carta);
	}

	@Test
	public void testGetSuit() {
		assertEquals(Suit.CLUBS, this.carta.getSuit());
	}

	@Test
	public void testGetType() {
		assertEquals(Rank.ACE, this.carta.getType());
	}

	@Test
	public void testGetValue() {
		assertEquals(1, this.carta.getValue());
	}

}
