package net.matt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.matt.entity.Card;
import net.matt.entity.CardList;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		
		CardList.loadCardList(new File("data.bin"));
		for (Card card : CardList.getCards()) {
			System.out.println(card);
		}
		System.out.println("Done");

	}

}
