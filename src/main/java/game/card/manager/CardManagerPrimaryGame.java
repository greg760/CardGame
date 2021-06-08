package game.card.manager;

import game.card.*;
import java.util.List;

public class CardManagerPrimaryGame extends CardManager {

    @Override
    public List<CardDistribution> createCardDistributionList() {

        addToCardDistributionList(new AwardedCard(1), 20);
        addToCardDistributionList(new AwardedCard(2), 10);
        addToCardDistributionList(new AwardedCard(3), 5);
        addToCardDistributionList(new ThreeTimesWinCard(), 1);
        addToCardDistributionList(new ResettingCard(), 7);
        addToCardDistributionList(new AdditionalLifeCard(),3);
        addToCardDistributionList(new EndPrimaryGameCard(),4);

        return cardDistributionList;

    }

}
