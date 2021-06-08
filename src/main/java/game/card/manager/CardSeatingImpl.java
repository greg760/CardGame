package game.card.manager;

import game.card.Card;
import tools.Tools;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSeatingImpl extends CardSeating {

    private Tools tools;

    public CardSeatingImpl(Tools tools) {
        this.tools = tools;
    }

    public CardSeatingImpl() {
        tools = new Tools();
    }

    public List<Card> createCardSeating(CardManager cardManager) {

        List<CardDistribution> listCardDistribution = cardManager.createCardDistributionList();
        List<Card> listCard = fillList(listCardDistribution);

        return tools.shuffleList(listCard);
    }

    private List<Card> fillList(List<CardDistribution> cardDistributionList) {

        List<Card> cardList = new ArrayList<>();

        for (CardDistribution cardDistribution : cardDistributionList) {

            List<Card> list = Collections.nCopies(cardDistribution.getAmount(), cardDistribution.getCard());
            cardList.addAll(list);
        }

        return cardList;
    }
}