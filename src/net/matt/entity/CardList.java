package net.matt.entity;

import java.util.ArrayList;
import java.util.Random;

import net.matt.entity.Card.Color;
import net.matt.entity.Card.Rarity;
import net.matt.entity.Card.Type;

public final class CardList {
	
	static Random random = new Random();
	final static int NUM_OF_CARDS = 12;
	
	static ArrayList<Card> cards = new ArrayList<Card>();
	
	public static Card fireOne = new Card("Fire 1", "It burns it's opponents.", Type.SPELL, Rarity.COMMON, Color.RED);
	public static Card fireTwo = new Card("Fire 2", "It burns hotter than 1.", Type.SPELL, Rarity.UNCOMMON, Color.RED);
	public static Card fireThree = new Card("Fire 3", "Hottest!", Type.SPELL, Rarity.RARE, Color.RED);
	public static Card iceOne = new Card("Ice 1", "Chilly freezing opponents.", Type.SPELL, Rarity.COMMON, Color.BLUE);
	public static Card iceTwo = new Card("Ice 2", "Cold-burrr", Type.SPELL, Rarity.UNCOMMON, Color.BLUE);
	public static Card iceThree = new Card("Ice 3", "Freezes opponents", Type.SPELL, Rarity.RARE, Color.BLUE);
	public static Card sunlightWarrior = new Card("Sunlight Warrior", "He hails from a land not far from here.", Type.MOB, Rarity.UNCOMMON, Color.WHITE);
	public static Card wanderingTroll = new Card("Wandering Troll", "He walks the mountainside with greif.", Type.MOB, Rarity.UNCOMMON, Color.RED);
	public static Card travelingMerchant = new Card("Traveling Merchant", "He wants to sell you his shit", Type.MOB, Rarity.COMMON, Color.BLACK);
	public static Card honorableWall = new Card("Honorable Wall", "It's made from justice!", Type.STRUCTURE, Rarity.COMMON, Color.WHITE);
	public static Card marshGrownTree = new Card("Marsh-grown Tree", "It was raised in a marsh.", Type.STRUCTURE, Rarity.COMMON, Color.BLACK);
	public static Card orcishWall = new Card("Orcish Wall", "This wall has brought shame to its family", Type.STRUCTURE, Rarity.UNCOMMON, Color.RED);
	
	
	public static Card getRandomCard(){
		int x = random.nextInt(NUM_OF_CARDS);
		switch (x) {
		case 0: return fireOne; 
		case 1: return fireTwo; 
		case 2: return fireThree; 
		case 3: return iceOne;
		case 4: return iceTwo;
		case 5: return sunlightWarrior;
		case 6: return wanderingTroll;
		case 7: return travelingMerchant;
		case 8: return honorableWall;
		case 9: return marshGrownTree;
		case 10: return orcishWall;
		case 11: return iceThree;
		default:
			return fireOne;
		}
	}
	
	public static void addCard(String name, String description, Type type, Rarity rarity, Color color){
		cards.add(new Card(name, description, type, rarity, color));
	}
}
