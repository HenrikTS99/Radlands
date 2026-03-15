package com.radlands.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.radlands.model.game.*;
import com.radlands.service.GameService;
import com.radlands.dto.*;

@RestController
@RequestMapping()
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("game")
    public ResponseEntity<GameDTO> getGameState() {
        GameDTO gameDTO = gameService.getGameDTO();
        return ResponseEntity.ok(gameDTO);

    }

    // @PostMapping("/action")
    // public GameDTO handleAction(@Requestbody GameAction action, @SessionAttribute
    // Long playerId) {
    //
    // }
    //
    // @PostMapping("/start")
    // Public GameDTO
    //
    // startGame(@SessionAttribute Long playerId) {
    //
    // }
    @GetMapping("player/{index}")
    public ResponseEntity<PlayerDTO> getPlayer(@PathVariable int index) {
        if (index < 0 || index >= players.size()) {
            return ResponseEntity.notFound().build();
        }
        Player player = players.get(index);
        PlayerDTO playerDTO = new PlayerDTO(player);
        return ResponseEntity.ok(playerDTO);
    }
}
