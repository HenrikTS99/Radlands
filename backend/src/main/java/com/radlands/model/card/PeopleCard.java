package com.radlands.model.card;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.card.CardState;
import com.radlands.model.Effect;

public class PeopleCard extends JunkableCard {
    public PeopleCard(Effect junkEffect, String name, String description, int cost, List<Ability> abilities,
            CardState state) {
        super(junkEffect, name, description, cost, abilities, state);
    }
}
