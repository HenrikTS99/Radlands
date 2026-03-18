package com.radlands.dto;

import java.util.List;

import com.radlands.model.card.BaseCard;
import com.radlands.model.card.CampCard;
import com.radlands.model.card.EventCard;
import com.radlands.model.card.JunkableCard;
import com.radlands.model.game.Player;

public record PlayerDTO(
        Long id,
        int water,
        List<CampCard> camps,
        boolean waterSiloOnHand,
        boolean raiderInPlay,
        BaseCard[][] playArea,
        EventCard[] eventQueue) {
    public PlayerDTO(Player player) {
        this(
                player.getId(),
                player.getWater(),
                player.getCamps(),
                player.isWaterSiloOnHand(),
                player.isRaiderInPlay(),
                player.getPlayArea(),
                player.getEventQueue());
    }

}
