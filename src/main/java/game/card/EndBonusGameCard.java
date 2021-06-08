package game.card;

import game.Game;

public class EndBonusGameCard extends Card {

    @Override
    public void turnAround(Game game) {

        game.getGameState().setGameOver(true);
    }
}