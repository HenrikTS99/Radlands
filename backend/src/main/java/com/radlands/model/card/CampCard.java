package com.radlands.model.card;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.card.CardState;

public class CampCard extends BaseCard {
    private int startAmount;

    public CampCard(String name, String description, int cost, List<Ability> abilities,
            CardState state, int startAmount) {
        super(name, description, cost, abilities, state);
        this.startAmount = startAmount;
    }

}
