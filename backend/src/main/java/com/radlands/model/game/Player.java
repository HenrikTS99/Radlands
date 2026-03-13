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
    private boolean raiderInPlay;
    private BaseCard[][] playArea = new BaseCard[3][3];
    private EventCard[] eventQueue = new EventCard[3];

    public Player(List<JunkableCard> playerHand, int water, List<CampCard> camps, boolean waterSiloOnHand,
            boolean raiderInPlay) {
        this.playerHand = playerHand;
        this.water = water;
        this.camps = camps;
        this.waterSiloOnHand = waterSiloOnHand;
        this.raiderInPlay = raiderInPlay;
    }

    public List<JunkableCard> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(List<JunkableCard> playerHand) {
        this.playerHand = playerHand;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public List<CampCard> getCamps() {
        return camps;
    }

    public void setCamps(List<CampCard> camps) {
        this.camps = camps;
    }

    public boolean isWaterSiloOnHand() {
        return waterSiloOnHand;
    }

    public void setWaterSiloOnHand(boolean waterSiloOnHand) {
        this.waterSiloOnHand = waterSiloOnHand;
    }

    public boolean isRaiderInPlay() {
        return raiderInPlay;
    }

    public void setRaiderInPlay(boolean raiderInPlay) {
        this.raiderInPlay = raiderInPlay;
    }

    public BaseCard[][] getPlayArea() {
        return playArea;
    }

    public void setPlayArea(BaseCard[][] playArea) {
        this.playArea = playArea;
    }

    public EventCard[] getEventQueue() {
        return eventQueue;
    }

    public void setEventQueue(EventCard[] eventQueue) {
        this.eventQueue = eventQueue;
    }

}
