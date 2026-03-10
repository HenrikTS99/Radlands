package com.radlands.model.card;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.CardState;
import com.radlands.model.Effect;

public class EventCard extends JunkableCard {
    private int queue;

    public EventCard(Effect junkEffect, int queue, String name, String description, int cost, List<Ability> abilities,
            CardState state) {
        super(junkEffect, name, description, cost, abilities, state);
        this.queue = queue;
    }
}
