package game.card.manager;

import game.card.AwardedCard;
import game.card.EndBonusGameCard;
import java.util.List;

public class CardManagerBonusGame extends CardManager {

    @Override
    public List<CardDistribution> createCardDistributionList() {

        addToCardDistributionList(new AwardedCard(10), 3);
        addToCardDistributionList(new AwardedCard(20), 2);
        addToCardDistributionList(new AwardedCard(30), 1);
        addToCardDistributionList(new EndBonusGameCard(), 1);

        return cardDistributionList;
    }
}
