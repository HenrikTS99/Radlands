package com.radlands.model.game;

import com.radlands.model.card.JunkableCard;
import com.radlands.model.card.CampCard;
import com.radlands.model.card.BaseCard;
import com.radlands.model.card.EventCard;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<JunkableCard> playerHand;
    private int water;
    private List<CampCard> camps;
    private boolean waterSiloOnHand;
    private boolean raiderOnHand;
    private BaseCard[][] playArea = new BaseCard[3][3];
    private EventCard[] eventQueue = new EventCard[3];

    public Player(List<JunkableCard> playerHand, int water, List<CampCard> camps, boolean waterSiloOnHand,
            boolean raiderOnHand) {
        this.playerHand = playerHand;
        this.water = water;
        this.camps = camps;
        this.waterSiloOnHand = waterSiloOnHand;
        this.raiderOnHand = raiderOnHand;
    }
}
