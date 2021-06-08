package game.card;

import game.Game;

public class EndPrimaryGameCard extends Card {

    @Override
    public void turnAround(Game game) {

        Integer additionalLife = game.getGameState().getAdditionalLife();

        if (additionalLife == 0) {
            game.getGameState().setGameOver(true);
        } else {
            game.getGameState().setAdditionalLife(additionalLife - 1);
        }
    }

}