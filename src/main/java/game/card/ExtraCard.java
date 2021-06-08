package game.card;

import game.Game;
import game.card.manager.CardManager;
import game.card.manager.CardSeating;


public class ExtraCard extends Card {

    @Override
    public void turnAround(Game game) {

        CardSeating cardSeating = game.getCardSeating();
        CardManager cardManager = game.getCardManagerBonusGame();

        game.turnAroundCardAfterCard(cardSeating.createCardSeating(cardManager));
    }
}