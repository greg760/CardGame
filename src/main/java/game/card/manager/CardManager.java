package game.card.manager;

import game.card.Card;
import java.util.ArrayList;
import java.util.List;


public abstract class CardManager {

    protected ArrayList<CardDistribution> cardDistributionList;

    public abstract List<CardDistribution> createCardDistributionList();


    public CardManager() {
        cardDistributionList = new ArrayList<>();
    }

    public void setCardDistributionList(ArrayList<CardDistribution> cardDistributionList) {
        this.cardDistributionList = cardDistributionList;
    }

    protected void addToCardDistributionList(Card card, Integer amount) {

        CardDistribution cardDistribution = new CardDistribution();

        cardDistribution.setCard(card);
        cardDistribution.setAmount(amount);

        cardDistributionList.add(cardDistribution);
    }
}






