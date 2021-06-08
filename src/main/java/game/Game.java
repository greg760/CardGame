package game;

import game.card.Card;
import game.card.manager.CardManager;
import game.card.manager.CardSeating;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private GameState gameState;
    private CardSeating cardSeating;
    private CardManager cardManagerPrimaryGame;
    private CardManager cardManagerBonusGame;


    public Game(CardSeating cardSeating, CardManager cardManagerPrimaryGame, CardManager cardManagerBonusGame) {

        this.cardSeating = cardSeating;
        this.cardManagerPrimaryGame = cardManagerPrimaryGame;
        this.cardManagerBonusGame = cardManagerBonusGame;
        this.gameState = new GameState();
    }

    public Integer startGame() {

        turnAroundCardAfterCard(cardSeating.createCardSeating(cardManagerPrimaryGame));

        return this.getGameState().getBalance();
    }

    public void turnAroundCardAfterCard(List<Card> list) {

        for (Card card : list) {

            card.turnAround(this);

            if (this.getGameState().isGameOver()) {
                break;
            }
        }
    }

    public GameState getGameState() {
        return gameState;
    }

    public CardSeating getCardSeating() {
        return cardSeating;
    }

    public CardManager getCardManagerBonusGame() {
        return cardManagerBonusGame;
    }

    public void resetGame() {

        gameState = new GameState();
        cardManagerPrimaryGame.setCardDistributionList(new ArrayList<>());
        cardManagerBonusGame.setCardDistributionList(new ArrayList<>());

    }
}
