package com.radlands.model.card;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.card.CardState;
import com.radlands.model.Effect;

public abstract class JunkableCard extends BaseCard {
    private Effect junkEffect;

    public JunkableCard(Effect junkEffect, String name, String description, int cost, List<Ability> abilities,
            CardState state) {
        super(name, description, cost, abilities, state);
        this.junkEffect = junkEffect;
    }

}
