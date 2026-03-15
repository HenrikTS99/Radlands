package com.radlands.model.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.radlands.model.card.BaseCard;

public class Deck {
    List<BaseCard> cards;
    List<BaseCard> discardPile;

    public Deck(List<BaseCard> cards) {
        this.cards = new ArrayList<>(cards);
        shuffle();
    }

    public BaseCard draw() {
        if (cards.isEmpty()) {
            if (discardPile.isEmpty())
                return null;
            cards = List.copyOf(discardPile);
            cards = new ArrayList<>(discardPile);
            shuffle();
            discardPile = new ArrayList<>();
        }
        return cards.remove(cards.size() - 1);
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public int getDeckSize() {
        return cards.size();
    }

}
