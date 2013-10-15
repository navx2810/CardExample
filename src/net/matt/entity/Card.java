package net.matt.entity;

public class Card {

	public enum Type { STRUCTURE, MOB, SPELL; }
	public enum Rarity { COMMON, UNCOMMON, RARE, LEGENDARY; }
	public enum Color { WHITE, RED, BLUE, GREEN, BLACK; }
	
	String name, description;
	Type type;
	Rarity rarity;
	Color color;
	
	public Card(String name, String description, Type type, Rarity rarity,
			Color color) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.rarity = rarity;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Type getType() {
		return type;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public Color getColor() {
		return color;
	}
	
	public String toString() {
		return String.format("[%s] : %s | %s | %s | %s |", name, description, color, rarity, type);
	}
	
	
}
