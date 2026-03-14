package com.radlands.model.card;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.card.CardState;

public abstract class BaseCard {
    private String name;
    private String description;
    private List<Ability> abilities;
    private CardState state = CardState.INTACT;

    public BaseCard(String name, String description, List<Ability> abilities, CardState state) {
        this.name = name;
        this.description = description;
        this.abilities = abilities;
        this.state = state;
    }

}
