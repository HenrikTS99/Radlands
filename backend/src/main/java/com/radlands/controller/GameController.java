package com.radlands.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.radlands.model.game.*;
import com.radlands.dto.PlayerDTO;

@RestController
@RequestMapping()
public class GameController {
    private Player player1 = new Player(new ArrayList<>(), 2, new ArrayList<>(), true, true);
    private Player player2 = new Player(new ArrayList<>(), 2, new ArrayList<>(), true, true);
    private ArrayList<Player> players = new ArrayList<>();

    public GameController() {
        players.add(player2);
        players.add(player1);
    }

    // @GetMapping("/state")
    // public GameDTO getGameState(@SessionAttribute Long playerId) {
    //
    // }
    //
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
