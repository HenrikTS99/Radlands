package com.radlands.model.game;

import java.util.ArrayList;
import java.util.List;

import com.radlands.data.DeckData;
import com.radlands.dto.PlayerDTO;
import com.radlands.model.game.*;

public class Game {
    private List<Player> players;
    private Deck campDeck;
    private Deck drawDeck;
    private int turn = 0;

    public Game() {
        this.players = createPlayers();
        this.drawDeck = new Deck(DeckData.createDrawDeck());
        this.campDeck = new Deck(DeckData.createCampDeck());
    }

    private List<Player> createPlayers() {
        Player player1 = new Player();
        Player player2 = new Player();
        return List.of(player1, player2);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<PlayerDTO> getPlayersDTO() {
        return players.stream()
                .map(PlayerDTO::new)
                .toList();
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getCampDeck() {
        return campDeck;
    }

    public void setCampDeck(Deck campDeck) {
        this.campDeck = campDeck;
    }

    public Deck getDrawDeck() {
        return drawDeck;
    }

    public int getDrawDeckSize() {
        return drawDeck.getDeckSize();
    }

    public void setDrawDeck(Deck drawDeck) {
        this.drawDeck = drawDeck;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

}
