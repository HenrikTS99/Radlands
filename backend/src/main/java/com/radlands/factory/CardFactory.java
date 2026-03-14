package com.radlands.factory;

import java.util.List;

import com.radlands.model.Ability;
import com.radlands.model.Effect;
import com.radlands.model.card.CampCard;
import com.radlands.model.card.CardState;
import com.radlands.model.card.EventCard;
import com.radlands.model.card.PeopleCard;

public class CardFactory {

    // People card defaults
    private static final CardState DEFAULT_STATE = CardState.INTACT;
    private static final List<Ability> NO_ABILITIES = List.of();

    public static PeopleCard people(String name, int cost, Effect junkEffect) {
        return new PeopleCard(name, "", cost, junkEffect, NO_ABILITIES, DEFAULT_STATE);
    }

    public static PeopleCard people(String name, int cost, Effect junkEffect, List<Ability> abilities) {
        return new PeopleCard(name, "", cost, junkEffect, abilities, DEFAULT_STATE);
    }

    public static EventCard event(String name, int cost, Effect junkEffect, int queue) {
        return new EventCard(junkEffect, name, "", cost, NO_ABILITIES, DEFAULT_STATE, queue);
    }

    public static EventCard event(String name, int cost, Effect junkEffect, List<Ability> abilities, int queue) {
        return new EventCard(junkEffect, name, "", cost, abilities, DEFAULT_STATE, queue);
    }

    public static CampCard camp(String name, int startAmount) {
        return new CampCard(name, "", NO_ABILITIES, DEFAULT_STATE, startAmount);
    }

}
