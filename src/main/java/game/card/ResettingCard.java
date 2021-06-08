package game.card;

import game.Game;

public class ResettingCard extends Card {

    @Override
    public void turnAround(Game game) {

        game.getGameState().setBalance(0);
    }
}