package com.company;

import java.util.Objects;

public class Card {
    private String deck;

    public Card(String deck) {
        this.deck = deck;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Card{" +
                "deck='" + deck + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(deck, card.deck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deck);
    }
}