package com.radlands.dto;

import java.util.List;

import com.radlands.model.game.Game;
import com.radlands.model.game.Player;

// TODO: add discard pile data?
// TODO: Players to be PlayerDTO, should not include player hand!
public record GameDTO(
        List<Player> players,
        int deckSize,
        int turn) {
    public GameDTO(Game game) {
        this(
                game.getPlayers(),
                game.getDrawDeckSize(),
                game.getTurn());
    }
}
