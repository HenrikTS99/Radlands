package com.radlands.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radlands.dto.GameDTO;
import com.radlands.model.game.Game;
import com.radlands.model.game.GameAction;
import com.radlands.model.game.Player;

@Service
public class GameService {
    private Game currGame;

    public GameService() {
        createGame();
    }

    public void createGame() {
        currGame = new Game();
    }

    public GameDTO getGameDTO() {
        return new GameDTO(currGame);
    }

    // public GameDTO performAction(Game game, GameAction action) {
    // }

}
