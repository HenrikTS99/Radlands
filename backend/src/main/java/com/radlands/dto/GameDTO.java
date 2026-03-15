package com.radlands.dto;

import java.util.List;

import com.radlands.model.game.Game;
import com.radlands.model.game.Player;

// TODO: add discard pile data?
public record GameDTO(
        List<PlayerDTO> players,
        int deckSize,
        int turn) {
    public GameDTO(Game game) {
        this(
                game.getPlayersDTO(),
                game.getDrawDeckSize(),
                game.getTurn());
    }
}
