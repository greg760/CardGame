package game.card;

import game.Game;

public class AdditionalLifeCard extends Card {

    @Override
    public void turnAround(Game game) {

        Integer additionalLife = game.getGameState().getAdditionalLife();
        game.getGameState().setAdditionalLife(additionalLife + 1);
    }
}