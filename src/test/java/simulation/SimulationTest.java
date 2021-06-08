package simulation;

import game.Game;
import game.card.AwardedCard;
import game.card.manager.CardDistribution;
import game.card.manager.CardManager;
import game.card.manager.CardManagerBonusGame;
import game.card.manager.CardSeatingImpl;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SimulationTest {


    @Test
    public void simTest() {


        Game game = new Game(new CardSeatingImpl(), new CardManagerPrimaryGameMock(), new CardManagerBonusGame());
        BigDecimal averageValue = new Simulation(10, game).findAverageValueBySimulation();

        assertEquals(averageValue, new BigDecimal("24.00"));
    }


    class CardManagerPrimaryGameMock extends CardManager {

        @Override
        public List<CardDistribution> createCardDistributionList() {

            addToCardDistributionList(new AwardedCard(1), 3);
            addToCardDistributionList(new AwardedCard(7), 1);
            addToCardDistributionList(new AwardedCard(14), 1);

            return cardDistributionList;
        }
    }
}
