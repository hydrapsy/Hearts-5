package sample;

/**
 * Created by Beiwen Liu on 1/23/2016.
 */
public class Card {
    private String suit;
    private String value;
    private int cardValue;
    private int pointValue;
    private boolean played;

    public Card(String value, String suit, int pointValue, int cardValue) {
        this.suit = suit;
        this.value = value;
        this.cardValue = cardValue;
        this.pointValue = pointValue;
        this.played = false;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    public int getPointValue() {
        return pointValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public boolean getPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    @Override
    public String toString() {
        return value + "Of" + suit;
    }
}
