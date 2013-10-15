package net.matt;

import net.matt.entity.Card;
import net.matt.entity.Deck;

public class DeckManager {

	public Deck deck;
	int deckSize, cardsRemaining, currentCard;
	
	public void constructDeck(String deckName, int deckSize){
		deck = new Deck(deckName, deckSize);
		cardsRemaining = deckSize;
		currentCard = 0;
	}
	
	public void constructDeck(String deckName, int deckSize, boolean autoFill){
		deck = new Deck(deckName, deckSize);
		cardsRemaining = deckSize;
		if (autoFill)
			deck.fillDeck();
	}		
	
	
	public Card drawCard(){
		cardsRemaining-=1;
		currentCard++;
		return deck.getCards().get(currentCard-1);
		
	}
	
	public String toString() {
		return deck.toString();
	}
	
}
