import game.Game;
import game.card.manager.*;
import simulation.Simulation;

import java.math.BigDecimal;


public class Main {


    public static void main(String[] args) {

        CardManager cardManagerPrimaryGame = new CardManagerPrimaryGame();
        CardManager cardManagerBonusGame = new CardManagerBonusGame();
        CardSeating cardSeating = new CardSeatingImpl();

        Game game = new Game(cardSeating, cardManagerPrimaryGame, cardManagerBonusGame);

        Simulation simulation = new Simulation(1000000, game);

        BigDecimal averageValue = simulation.findAverageValueBySimulation();

        System.out.println(averageValue);
    }
}
