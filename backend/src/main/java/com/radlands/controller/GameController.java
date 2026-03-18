package com.radlands.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.radlands.model.game.*;
import com.radlands.service.GameService;

import jakarta.servlet.http.HttpSession;

import com.radlands.dto.*;

@RestController
@RequestMapping()
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("game")
    public ResponseEntity<GameDTO> getGameState(@RequestParam(required = false) Long playerId) {
        if (playerId == null) {
            GameDTO gameDTO = gameService.getGame();
            return ResponseEntity.ok(gameDTO);
        }
        GameDTO gameDTO = gameService.getGame(playerId);
        return ResponseEntity.ok(gameDTO);

    }

    @GetMapping("session")
    public Long getSession(HttpSession session) {
        return (Long) session.getAttribute("playerId");
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
    // @GetMapping("player/{index}")
    // public ResponseEntity<PlayerDTO> getPlayer(@PathVariable int index) {
    // if (index < 0 || index >= players.size()) {
    // return ResponseEntity.notFound().build();
    // }
    // Player player = players.get(index);
    // PlayerDTO playerDTO = new PlayerDTO(player);
    // return ResponseEntity.ok(playerDTO);
    // }
}
