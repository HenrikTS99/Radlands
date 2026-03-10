package com.radlands.model.card;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.CardState;

public abstract class BaseCard {
    private String name;
    private String description;
    private int cost;
    private List<Ability> abilities;
    private CardState state = CardState.INTACT;

    public BaseCard(String name, String description, int cost, List<Ability> abilities, CardState state) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.abilities = abilities;
        this.state = state;
    }

}
