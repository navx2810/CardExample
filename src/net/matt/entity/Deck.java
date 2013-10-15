package net.matt.entity;

import java.util.ArrayList;

public class Deck {
	
	String name;
	ArrayList<Card> cards;
	int cardLimit;
	
	public Deck(String name, int cardLimit) {
		this.cardLimit = cardLimit;
		cards = new ArrayList<Card>(cardLimit);
		this.name = name;
	}
	
	public void fillDeck(){
		for (int i = 0; i < cardLimit ; i++) {
			cards.add(CardList.getRandomCard());
		}
	}
	
	public void fillDeck(int numOfMob, int numOfStruct, int numOfSpells){
		
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public String toString() {
		String msg = "["+name+"]: ";
		for (Card card : cards) 
			msg += "|"+card.getName()+"| ";
		return msg;
	
	}
}
