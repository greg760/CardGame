package game.card;

import game.Game;

public class AwardedCard extends Card {


    private Integer win;

    public AwardedCard(Integer win) {

        this.win = win;
    }

    @Override
    public void turnAround(Game game) {

        Integer currentBalance = game.getGameState().getBalance();
        game.getGameState().setBalance(currentBalance + win);
    }
}