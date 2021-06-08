package game.card;

import game.Game;

public class ThreeTimesWinCard extends Card {

    @Override
    public void turnAround(Game game) {

        Integer currentBalance = game.getGameState().getBalance();
        game.getGameState().setBalance(currentBalance * 3);
    }
}

