package com.radlands.data;

import java.util.List;

import com.radlands.factory.CardFactory;
import com.radlands.model.Effect;
import com.radlands.model.card.BaseCard;

public class DeckData {
    public static List<BaseCard> createDrawDeck() {
        return List.of(
                CardFactory.people("Looter", 1, Effect.WATER),
                CardFactory.people("Looter", 1, Effect.WATER),
                CardFactory.people("Wounded Solider", 1, Effect.INJURE),
                CardFactory.people("Wounded Solider", 1, Effect.INJURE),
                CardFactory.people("Vigilante", 1, Effect.RAID),
                CardFactory.people("Vigilante", 1, Effect.RAID),
                // unique people
                CardFactory.people("Argo Yeski", 3, Effect.PUNK),
                // Events
                CardFactory.event("Strafe", 2, Effect.DRAW, 0),
                CardFactory.event("Radiation", 2, Effect.RAID, 1));
    }

    public static List<BaseCard> createCampDeck() {
        return List.of(
                CardFactory.camp("Mulcher", 0),
                CardFactory.camp("The Octagon", 0),
                CardFactory.camp("Bonfire", 1));
    }
}
