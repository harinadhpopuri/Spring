/**
 * 
 */
package com.personal.defaultmethods;

import java.util.Comparator;

/**
 * @author hpopuri
 *
 */
public interface Card extends Comparable<Card>{

	public enum Suit {
		DIAMONDS(1,"Diamonds"),
		SPADES(2,"Spades"),
		HEARTS(3,"Hearts"),
		CUBES(4,"Cubes");
		
		private final int value;
		private final String text;
		Suit(int value, String text) {
			this.value = value;
			this.text = text;
		}
		
		public int value() {return value;}
		public String text() {return text;}
		
	}
	
	public enum Rank{
		
		DUECE(2,"Two"),
		THREE(3,"Three"),
		FOUR(4,"Four"),
		FIVE(5,"Five"),
		SIX(6,"Six"),
		SEVEN(7,"Seven"),
		EIGHT(8,"Eight"),
		NINE(9,"nine"),
		TEN(10,"Ten"),
		JACK(11,"Jack"),
		QUEEN(12,"Queen"),
		KING(13,"King"),
		ACE(14,"Ace");
		
		
		
		private final int value;
		private final String text;
		Rank(int value,String text){
			this.value = value;
			this.text = text;
		}
		public int getValue() {return value;}
		public String getText() {return text;}
		
	}
	
	public Card.Suit getSuit();
	public Card.Rank getRank();

}
