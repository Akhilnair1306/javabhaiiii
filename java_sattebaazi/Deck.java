package java_sattebaazi;

import java.util.ArrayList;
import java.util.Collections;

// import java.util.ArrayList;
class Card {
    private String value;
    private String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        switch (value) {
            case "A": return 14;
            case "K": return 13;
            case "Q": return 12;
            case "J": return 11;
            default: return Integer.parseInt(value);
        }
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }
}
 class Deck {
    private final String[] decks = {"Hearts", "Club", "Diamond", "Spade"};
    private final String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private ArrayList<Card> packOfCards;
    
    public Deck() {
        packOfCards = new ArrayList<>();
        createDeck();
    }

    public void createDeck () {
        for ( String deck: decks) {
            for ( String value: values) {
                packOfCards.add(new Card(value,deck));
            }
        }
        // return packofCards;
    }

    public void shuffleDeck() {
        Collections.shuffle(packOfCards);
    }

    public ArrayList<Card> getCards () {
        return packOfCards;
    }

    public Card drawCard () {
        return packOfCards.remove(0);
    }

    public void addDeck() {
        createDeck();
        shuffleDeck();
    }

}
