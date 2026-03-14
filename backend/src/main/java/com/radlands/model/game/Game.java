package com.radlands.model.game;

import java.util.List;

import com.radlands.data.DeckData;
import com.radlands.model.game.*;

public class Game {
    private List<Player> players;
    private Deck campDeck;
    private Deck drawDeck;
    private int turn = 0;

    public Game(List<Player> players) {
        this.players = players;
        this.drawDeck = new Deck(DeckData.createDrawDeck());
        this.campDeck = new Deck(DeckData.createCampDeck());
    }
}
