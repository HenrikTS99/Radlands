package com.radlands.dto;

import java.util.List;

import com.radlands.model.card.JunkableCard;
import com.radlands.model.game.Game;

// TODO: add discard pile data?
public record GameDTO(
        List<PlayerDTO> players,
        int deckSize,
        int turn,
        Long myPlayerId, List<JunkableCard> myHand) {

    public GameDTO(Game game) {
        this(
                game.getPlayersDTO(),
                game.getDrawDeckSize(),
                game.getTurn(),
                null,
                null);
    }

    public GameDTO(Game game, Long myPlayerId, List<JunkableCard> playerHand) {
        this(
                game.getPlayersDTO(),
                game.getDrawDeckSize(),
                game.getTurn(),
                myPlayerId,
                playerHand);
    }
}
