package simulation;

import game.Game;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Simulation {

    private Integer simulationsNumber;
    private Game game;

    public Simulation(Integer simulationsNumber, Game game) {

        this.simulationsNumber = simulationsNumber;
        this.game = game;
    }

    public BigDecimal findAverageValueBySimulation() {

        BigInteger totalWin = new BigInteger("0");

        for (int a = 0; a < simulationsNumber; a++) {

            Integer win = game.startGame();
            totalWin = totalWin.add(BigInteger.valueOf(win));
            game.resetGame();
        }

        return countAverageValue(totalWin);
    }

    private BigDecimal countAverageValue(BigInteger totalWin) {

        BigDecimal simNumber = new BigDecimal(simulationsNumber);
        BigDecimal averageValue = new BigDecimal(totalWin).divide(simNumber, MathContext.DECIMAL32);

        return averageValue.setScale(2, RoundingMode.HALF_UP);
    }
}
