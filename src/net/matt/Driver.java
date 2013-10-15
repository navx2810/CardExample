package net.matt;

public class Driver {

	public static void main(String[] args) {
		
		DeckManager deckManager = new DeckManager();
		
		deckManager.constructDeck("TestTwo", 15, true);
		System.out.println(deckManager);
		System.out.println(deckManager.drawCard());
		System.out.println(deckManager.drawCard());
		System.out.println(deckManager.cardsRemaining);

	}

}
